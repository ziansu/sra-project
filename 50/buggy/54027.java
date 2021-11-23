private void setWhereOnProvinciasLoc(es.udc.cartolab.gvsig.elle.utils.ELLEMap map) {
    es.udc.cartolab.gvsig.elle.gui.wizard.save.LayerProperties overviewLayer = map.getOverviewLayer("Provincias_galicia_loc");
    java.lang.String where = constantsPanel.buildWhereForProvinciasLoc();
    overviewLayer.setWhere(where);
}