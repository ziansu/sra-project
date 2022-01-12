public com.github.ddth.djs.bo.log.TaskLogBo setTimestampFinish(java.util.Date timestamp) {
    setAttribute(com.github.ddth.djs.bo.log.TaskLogBo.ATTR_TIMESTAMP_FINISH, timestamp);
    if (timestamp == null) {
        setAttribute(com.github.ddth.djs.bo.log.TaskLogBo.ATTR_DURATION_FINISH, null);
    }else {
        java.util.Date timestampPickup = getTimestampPickup();
        long duration = (timestampPickup != null) ? (timestamp.getTime()) - (timestampPickup.getTime()) : 0;
        setAttribute(com.github.ddth.djs.bo.log.TaskLogBo.ATTR_DURATION_FINISH, duration);
    }
    return this;
}