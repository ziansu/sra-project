void fillMetaData(test.tvdb.dev.com.tvdb_test.MetaEpisode metaData, java.util.ArrayList<test.tvdb.dev.com.tvdb_test.Season> tmpSeasons) {
    test.tvdb.dev.com.tvdb_test.ShowDate.ShowIndex toBeSeen = getNextIndexShowDate();
    if ((toBeSeen.episode) == (-1))
        metaData.full = true;
    else
        metaData.full = false;
    
    metaData.season = toBeSeen.season;
    metaData.index = toBeSeen.episode;
    if ((tmpSeasons.get(0).getSeasonNumber()) == 0)
        metaData.seasonOffset = 1;
    else
        metaData.seasonOffset = 0;
    
}