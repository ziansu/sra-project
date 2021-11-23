public void setIsVIPChannel(java.lang.String isVIPChannel) {
    if (org.apache.commons.lang.StringUtils.isNotBlank(isVIPChannel)) {
        this.isVIPChannel = isVIPChannel;
        java.lang.System.setProperty(ClientConfig.SendMessageWithVIPChannelProperty, isVIPChannel);
        logger.info("setIsVIPChannel isVIPChannel={}", isVIPChannel);
    }
    if (org.apache.commons.lang.StringUtils.isBlank(this.addr)) {
        throw new java.lang.IllegalArgumentException("======ERROR====== setIsVIPChannel is empty ======ERROR====== ");
    }
}