public void setColumnForSlice(int colIndex, int sliceNo, double[] values) {
    int[] indices = Commons.ArrayIndexing.getIndices((sliceNo + 1), processedProperties[fntd.classes.TrackspotResults.SLICE_NO]);
    Commons.ArrayIndexing.setSubColumn(processedProperties, colIndex, indices, values);
}