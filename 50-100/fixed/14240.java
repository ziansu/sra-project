public synchronized java.util.Date getAndSyncTime(long sTime, long seqNum) {
    if ((seqNum + (xbeerouter.SensorTime.MAX_PKT_BUF)) < (this.seqNum)) {
        xbeerouter.SensorTime.LOGGER.warning("Possible sensor reset detected!");
        initialSync(sTime, seqNum);
        return new java.util.Date(((startTime.getTime()) + sTime));
    }
    this.seqNum = seqNum;
    return new java.util.Date(((startTime.getTime()) + sTime));
}