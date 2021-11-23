public void addStatistic(com.frdfsnlght.inquisitor.Statistic statistic) {
    synchronized(statistics) {
        if (statistics.containsKey(statistic.getName())) {
            throw new java.lang.IllegalArgumentException(((statistic + " already exists in ") + (this)));
        }
        statistics.put(statistic.getName(), statistic);
    }
    statistic.setGroup(this);
    statistic.validate();
    for (com.frdfsnlght.inquisitor.Statistics s : stats.values()) {
        s.addStatistic(statistic);
    }
}