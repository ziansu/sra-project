private void buildTime(boolean isStartTime, long time) {
    if (isStartTime) {
        queryBuilder.startTime(time);
        isStartTime = false;
    }else {
        queryBuilder.endTime(time);
    }
}