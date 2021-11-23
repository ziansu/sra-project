private static double getASinhStretchedPixelValue(double x, double dr, double zp, double mp, double bp, double wp) {
    double rd = (dr * (x - zp)) / mp;
    double nsd = (edu.caltech.ipac.visualize.plot.FitsRead.asinh(rd)) / (edu.caltech.ipac.visualize.plot.FitsRead.asinh((mp - zp)));
    double pixValue = (255 * (nsd - bp)) / wp;
    return pixValue;
}