public com.nc.o1.musicmetacollection.model.TrackList regexpSearch(com.nc.o1.musicmetacollection.model.TrackList trackList, java.lang.String searchParam, java.lang.String searchValue) {
    com.nc.o1.musicmetacollection.model.TrackList searchList = new com.nc.o1.musicmetacollection.model.TrackList();
    java.lang.String trackParam;
    for (int i = 0; i < (trackList.size()); i++) {
        trackParam = trackParam(i, searchParam, trackList);
        if (regexp(searchValue, trackParam)) {
            searchList.addTrackInfo(trackList.getTrackInfo(i));
            break;
        }
    }
    return searchList;
}