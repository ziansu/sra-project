public void removeStatistic(com.frdfsnlght.inquisitor.Statistic statistic) {
    synchronized(statistics) {
        if (!(statistics.containsKey(statistic.getName()))) {
            return ;
        }
        statistics.remove(statistic.getName());
    }
    for (com.frdfsnlght.inquisitor.Statistics s : stats.values()) {
        s.removeStatistic(statistic);
    }
}