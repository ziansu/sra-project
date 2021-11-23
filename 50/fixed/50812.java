public java.lang.String getRegionString(int regionId) {
    if ((mRegionMap.get(regionId)) != null) {
        return mRegionMap.get(regionId).getRegion();
    }else {
        return null;
    }
}