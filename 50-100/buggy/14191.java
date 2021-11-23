public void setLowerBnd(java.lang.Double lowerBnd) {
    getWidget().setLwrBndVal(lowerBnd);
    if ((this.getPeakfindingtool()) != null)
        this.getPeakfindingtool().updateBoundsLower(lowerBnd);
    
    if ((this.selectedRegion) != null) {
        double[] endPnt = this.selectedRegion.getPointRef();
        this.selectedRegion.setEndPoint(new double[]{ upperBnd , endPnt[1] });
    }
    this.lowerBnd = lowerBnd;
}