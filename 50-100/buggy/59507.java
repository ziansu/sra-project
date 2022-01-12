@java.lang.Override
public com.laudandjolynn.mytv.model.TvStation getStation(java.lang.String stationName) {
    com.laudandjolynn.mytv.model.TvStation station = com.laudandjolynn.mytv.utils.MemoryCache.getInstance().getStation(stationName);
    if (station == null) {
        station = tvDao.getStation(stationName);
        com.laudandjolynn.mytv.utils.MemoryCache.getInstance().addCache(station);
    }
    return station;
}