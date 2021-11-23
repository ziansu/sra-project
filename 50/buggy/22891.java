public final mytown.datasource.Rank newRank(java.lang.String name, mytown.datasource.Town town, mytown.datasource.Rank.Type type) {
    mytown.datasource.Rank rank = new mytown.datasource.Rank(name, town, type);
    if (mytown.datasource.RankEvent.fire(new mytown.datasource.RankEvent.RankCreateEvent(rank)))
        return null;
    
    return rank;
}