public void setUpperBnd(java.lang.Double upperBnd) {
    getWidget().setUprBndVal(upperBnd.shortValue());
    if ((getPeakfindingtool()) != null)
        getPeakfindingtool().updateBoundsUpper(upperBnd);
    
    if ((selectedRegion) != null) {
        double[] endPnt = this.selectedRegion.getEndPoint();
        endPnt[0] = upperBnd;
        this.selectedRegion.setEndPoint(endPnt);
    }
    this.upperBnd = upperBnd;
}