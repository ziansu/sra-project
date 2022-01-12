private void setError(io.netty.channel.Channel channel, java.lang.Error error) {
    com.google.common.base.Preconditions.checkNotNull(error);
    try (alluxio.resource.LockResource lr = new alluxio.resource.LockResource(mLock)) {
        if ((mContext.getError()) != null) {
            return ;
        }
        mContext.setError(error);
        if (!(mContext.isPacketReaderActive())) {
            mContext.setPacketReaderActive(true);
            mPacketReaderExecutor.submit(createPacketReader(mContext, channel));
        }
    }
}