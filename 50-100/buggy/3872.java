public com.github.ddth.djs.bo.log.TaskLogBo setTimestampFinish(java.util.Date timestamp) {
    if (timestamp == null) {
        timestamp = new java.util.Date();
    }
    setAttribute(com.github.ddth.djs.bo.log.TaskLogBo.ATTR_TIMESTAMP_FINISH, timestamp);
    java.util.Date timestampPickup = getTimestampPickup();
    long duration = (timestampPickup != null) ? (timestamp.getTime()) - (timestampPickup.getTime()) : 0;
    setAttribute(com.github.ddth.djs.bo.log.TaskLogBo.ATTR_DURATION_FINISH, duration);
    return this;
}