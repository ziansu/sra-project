private boolean verifyRegionSet(java.lang.String regionSet) {
    boolean result = true;
    if ((stringContains(regionSet, ",")) > 0) {
        java.lang.String[] splitRegionSet = regionSet.split(",");
        for (java.lang.String aSplitRegionSet : splitRegionSet) {
            if ((java.lang.Integer.valueOf(aSplitRegionSet)) >= (sampleRegion.length)) {
                result = false;
                break;
            }
        }
    }
    return result;
}