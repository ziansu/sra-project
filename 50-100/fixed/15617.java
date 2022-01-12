public void doSetZoomCenter(final int newZoom, final double newCenter) {
    if (chrName.equals(Globals.CHR_ALL)) {
        chrName = org.broad.igv.ui.panel.ReferenceFrame.getGenome().getHomeChromosome();
    }
    if (!(chrName.equals(Globals.CHR_ALL))) {
        setZoom(newZoom);
        centerOnLocation(newCenter);
    }
}