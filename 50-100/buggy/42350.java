void setScale() {
    if ((pqrstPlot) != null) {
        pqrstPlot.setRangeBoundaries(range, (-(range)), BoundaryMode.FIXED);
        pqrstPlot.setDomainBoundaries(((-(displayTime)) / 2), ((displayTime) / 2), BoundaryMode.FIXED);
        pqrstPlot.redraw();
    }
}