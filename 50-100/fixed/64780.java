private void send(int type, java.lang.String[] keys, java.lang.Object data) {
    if ((channel) == null) {
        logger.error("channel is not prepared");
        return ;
    }
    org.caiguoqing.salay.entity.Message message = new org.caiguoqing.salay.entity.Message();
    message.setType(type);
    message.setKeys(keys);
    message.setData(data);
    channel.writeAndFlush(message);
}