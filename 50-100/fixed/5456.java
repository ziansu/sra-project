public void addTelevisionToChannel(TV.Television television, TV.Channel previousChannel, TV.Channel newChannel) {
    if (previousChannel != null) {
        logger.info(java.lang.String.format("Removing television (%s) from previous channel (%s).", television.getId(), previousChannel.getId()));
        channelMap.removeTV(previousChannel, television);
    }
    logger.info(java.lang.String.format("Adding television (%s) to channel (%s).", television.getId(), newChannel.getId()));
    channelMap.putTV(newChannel, television);
}