public double[] getNSlices() {
    double[] nSlices = new double[getNTracks()];
    Commons.ArrayCalc.subArrays(properties[fntd.tracking.TrackResults.SLICE_END], properties[fntd.tracking.TrackResults.SLICE_START], nSlices);
    Commons.ArrayCalc.addToArray(nSlices, 1.0, nSlices);
    return nSlices;
}