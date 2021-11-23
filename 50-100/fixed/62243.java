public double[] getMzValuesAsArray() throws java.lang.InterruptedException {
    if ((mzValuesAsArray) == null) {
        mutex.acquire();
        if ((mzValuesAsArray) == null) {
            mzValuesAsArray = new double[peakList.size()];
            int counter = 0;
            for (double currentMz : peakList.keySet()) {
                mzValuesAsArray[(counter++)] = currentMz;
            }
        }
        mutex.release();
    }
    return mzValuesAsArray;
}