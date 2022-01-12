public double getCompetition(int startDay, int endDay, java.util.Set<tau.tac.adx.report.adn.MarketSegment> targetSegment) {
    double totalDemand = 0;
    for (int i = startDay; i <= endDay; i++) {
        java.util.HashMap<java.util.Set<tau.tac.adx.report.adn.MarketSegment>, java.lang.Double> competitionDay = competition.get(i);
        totalDemand += competitionDay.get(targetSegment);
    }
    return totalDemand;
}