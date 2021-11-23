public void setLinkedMarker(org.jfree.chart.plot.ValueMarker aM) {
    iLink = aM;
    iLink.setValue(com.ivli.roim.controls.XYSeriesUtilities.getNearestY(getValue(), iSeries));
    iLink.setLabelAnchor(RectangleAnchor.BOTTOM);
    iLink.setLabelOffset(RectangleInsets.ZERO_INSETS);
}