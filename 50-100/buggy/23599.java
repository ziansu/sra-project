public double getmeanwaitingtime() {
    double totalwaitingtime = 0;
    for (int i = 0; i < ((waitingtimes.size()) - 1); i++) {
        totalwaitingtime += waitingtimes.get(i);
    }
    return totalwaitingtime / (q.gettraitedClientsNumber());
}