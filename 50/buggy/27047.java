edu.caltech.ipac.visualize.plot.Histogram getHistogram() {
    if ((hist) == null) {
        computeHistogram();
    }
    return hist;
}