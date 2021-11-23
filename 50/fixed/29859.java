private double[] getRelSdWidth() {
    double[] relSdWidth = new double[getNTracks()];
    Commons.ArrayCalc.divArrays(properties[fntd.tracking.TrackResults.SD_WIDTH], properties[fntd.tracking.TrackResults.MEAN_WIDTH], relSdWidth);
    return relSdWidth;
}