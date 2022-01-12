public synchronized void printStatus() {
    logger.LogUtil.println((("status of " + (this.localName)) + " ::"));
    logger.LogUtil.println(("  num msgs sent: " + (this.numMsgSent)));
    logger.LogUtil.println(("  num msgs rcvd: " + (this.numMsgReceived)));
    logger.LogUtil.println(("  request state: " + (this.requestState)));
}