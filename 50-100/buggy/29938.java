public int[] getStatistics() {
    int[] result = new int[4];
    result[0] = CityInfoCrawler.CityInfoQPP.getUpdatedCityCount();
    if (isMasterNode) {
        result[1] = ((int) (resCache.getLookupCount()));
        result[2] = ((int) (resCache.getLookupMissCount()));
        result[3] = ((int) (resCache.getMaxLoadInBytes()));
    }
    return result;
}