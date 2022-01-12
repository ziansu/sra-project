private boolean verifyRegionSet(java.lang.String regionSet) {
    boolean result = false;
    if ((stringContains(regionSet, ",")) > 0) {
        java.lang.String[] splitRegionSet = regionSet.split(",");
        for (java.lang.String aSplitRegionSet : splitRegionSet) {
            result = (java.lang.Integer.valueOf(aSplitRegionSet)) < (sampleRegion.length);
        }
    }
    return result;
}