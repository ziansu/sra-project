private long calculateTimeCost(java.util.Properties properties) {
    java.lang.Long first_commit_time = java.lang.Long.valueOf(((properties.get("first_commit")) + ""));
    java.util.Date startTime = new java.util.Date((first_commit_time * 1000));
    java.util.Date endTime = new java.util.Date();
    return ((endTime.getTime()) - (startTime.getTime())) / 1000;
}