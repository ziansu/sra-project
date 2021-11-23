public static java.util.List<java.lang.String> getListOfUpdatedSlices(org.carbondata.core.load.LoadMetadataDetails[] details) {
    java.util.List<java.lang.String> updatedSlices = new java.util.ArrayList<java.lang.String>(org.carbondata.core.constants.CarbonCommonConstants.DEFAULT_COLLECTION_SIZE);
    for (org.carbondata.core.load.LoadMetadataDetails oneLoad : details) {
        if (CarbonCommonConstants.MARKED_FOR_UPDATE.equals(oneLoad.getLoadStatus())) {
            if (null != (oneLoad.getMergedLoadName())) {
                updatedSlices.add(oneLoad.getMergedLoadName());
            }else {
                updatedSlices.add(oneLoad.getLoadName());
            }
        }
    }
    return updatedSlices;
}