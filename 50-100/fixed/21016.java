public void addRanking(com.immabed.rankmaster.rankings.compare.Ranking ranking) throws com.immabed.rankmaster.rankings.compare.RankingDoesNotShareRankTableException {
    if ((mainRanking) == null) {
        if (ranking.getRankTableId().equals(id))
            mainRanking = ranking;
        else
            throw new com.immabed.rankmaster.rankings.compare.RankingDoesNotShareRankTableException("Tried to add main ranking without proper RankTable.");
        
    }else {
        mainRanking.addFallbackRanking(ranking);
    }
}