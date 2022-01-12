@java.lang.Override
public void onRiakErrorResponse(io.netty.channel.Channel channel, com.basho.riak.client.core.RiakResponseException ex) {
    logger.debug("Riak replied with error; {}:{}", ex.getCode(), ex.getMessage());
    final com.basho.riak.client.core.FutureOperation inProgress = inProgressMap.remove(channel);
    consecutiveFailedOperations.incrementAndGet();
    if (inProgress != null) {
        inProgress.setException(ex);
        returnConnection(channel);
    }
}