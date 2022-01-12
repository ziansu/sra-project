public void setPrintDecimals(int printDecimals, boolean update) {
    this.printDecimals = printDecimals;
    for (int i = 0; i < (geoList.size()); i++) {
        geogebra.common.kernel.geos.GeoElement geo = ((geogebra.common.kernel.geos.GeoElement) (geoList.get(i)));
        if ((geo instanceof geogebra.common.kernel.geos.TextProperties) && (!(geo.isLabelSet())))
            ((geogebra.common.kernel.geos.TextProperties) (geo)).setPrintDecimals(printDecimals, update);
        
    }
}