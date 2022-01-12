public webapp.model.Summoner searchAllSummonerInfo(java.lang.String username) throws java.io.IOException, java.lang.UnsupportedOperationException, org.json.simple.parser.ParseException, webapp.exception.RateLimitExceededException {
    java.lang.System.out.println("-------------------NEW SEARCH-------------------");
    webapp.model.Summoner summoner = searchSummonerBasicInfo(removeSpecialCharacters(username));
    java.util.LinkedHashMap<webapp.model.Champion, webapp.model.Stats> championMap = searchChampionList(summoner);
    calculateSummonerSummaryStats(summoner, championMap);
    webapp.model.RankedDivision rankedDivision = searchRankedDivision(summoner);
    summoner.setRankedDivision(rankedDivision);
    summoner.setMostPlayedChampions(searchMostPlayedChampionList(championMap));
    return summoner;
}