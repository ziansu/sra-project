public <T> T getStatistic(java.lang.String statisticName, java.lang.Class<T> clazz) {
    if (((statisticName == null) || ("".equals(statisticName))) || ((stats.get(statisticName)) == null)) {
        return null;
    }
    return clazz.cast(stats.get(statisticName));
}