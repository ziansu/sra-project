private void buildTime(long time) {
    if (isStartTime) {
        queryBuilder.startTime(time);
        isStartTime = !(isStartTime);
    }else {
        queryBuilder.endTime(time);
    }
}