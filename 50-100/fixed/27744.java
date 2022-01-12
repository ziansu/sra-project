public void setUpperBnd(double upperBnd) {
    getWidget().setUprBndVal(upperBnd);
    if ((getPeakfindingtool()) != null)
        getPeakfindingtool().updateBoundsUpper(upperBnd);
    
    if ((selectedRegion) != null) {
        double[] endPnt = this.selectedRegion.getEndPoint();
        endPnt[0] = upperBnd;
        this.selectedRegion.setEndPoint(endPnt);
    }
    this.upperBnd = upperBnd;
}