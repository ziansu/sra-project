private void getAndProcessModelSubPaths(com.postagger.data.pairs.AbstractStartTagEndTagPair startTagEndTagPair, java.util.Map<java.lang.String, java.util.List<com.postagger.data.subpaths.SubPathData>> startTagsMap, java.util.Map<java.lang.String, java.util.List<com.postagger.data.subpaths.SubPathData>> endTagsMap) {
    startTagEndTagPair.accept(subPathsModelAccessVisitor);
    java.util.List<com.postagger.data.subpaths.SubPathData> subPathsModelDataList = startTagEndTagPair.getSubPathsModelDataList();
    calculateSubPathsProbabilities(subPathsModelDataList);
    populateStartTagsMap(startTagsMap, subPathsModelDataList);
    populateEndTagsMap(endTagsMap, subPathsModelDataList);
}