private void drawAll(java.awt.Graphics g) {
    plot1d.RegionExtent extent = plot1d.DataPoint.getExtent(points);
    plot1d.BorderBox box = new plot1d.BorderBox(getSize());
    plot1d.MappingToGUI trans = new plot1d.MappingToGUI(box, extent);
    axes = plot1d.AbstractAxis.factory(trans);
    drawAxes(g, trans);
    drawBorderBox(g, box);
    drawPoints(g, trans);
}