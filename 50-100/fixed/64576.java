@java.lang.Override
public kekbit.channel.ChannelAddress receive(java.nio.ByteBuffer data) throws java.io.IOException {
    if (open) {
        while (open) {
            kekbit.channel.LocalMessage msg = channelAddress.readMessage();
            if (msg != null) {
                kekbit.mem.ByteBufferUtils.copyTo(msg.data, data);
                return msg.address;
            }
        } 
        return null;
    }else {
        throw new java.lang.IllegalStateException();
    }
}