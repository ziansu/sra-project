public <T> T getStatistic(java.lang.String statisticName, java.lang.Class<T> clazz) {
    if (((statisticName == null) || (statisticName.trim().equals(""))) || ((stats.get(statisticName)) == null)) {
        return null;
    }
    return clazz.cast(stats.get(statisticName));
}