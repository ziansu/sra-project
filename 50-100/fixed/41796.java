public void setPrintDecimals(final int printDecimals, final boolean update) {
    this.printDecimals = printDecimals;
    for (int i = 0; i < (geoList.size()); i++) {
        final geogebra.common.kernel.geos.GeoElement geo = geoList.get(i);
        if ((geo instanceof geogebra.common.kernel.geos.TextProperties) && (!(geo.isLabelSet()))) {
            ((geogebra.common.kernel.geos.TextProperties) (geo)).setPrintDecimals(printDecimals, update);
        }
    }
}