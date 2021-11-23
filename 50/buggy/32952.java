public double getLon(int index) {
    return ((lonCoords[index]) * (anl.verdi.plot.gui.MeshPlot.RAD_TO_DEG)) + (columnAxis.getRange().getOrigin());
}