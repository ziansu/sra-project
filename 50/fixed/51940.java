public void setLayer(fr.pigeo.rimap.rimaprcp.riskcatalog.AbstractLayer wms) {
    this.layer = wms;
    this.layerName = wms.getName();
    this.updateDisplay();
}