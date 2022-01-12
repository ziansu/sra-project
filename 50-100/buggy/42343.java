public java.lang.Boolean getBackgroundValues() {
    org.jdom.Element el = getParameter(it.geosolutions.geoserver.rest.encoder.coverage.GSImageMosaicEncoder.backgroundValuesFilter);
    if (el != null) {
        java.util.List<org.jdom.Element> values = el.getChildren();
        for (org.jdom.Element elm : values) {
            java.lang.String value = elm.getValue();
            if (!(value.equalsIgnoreCase(it.geosolutions.geoserver.rest.encoder.coverage.GSImageMosaicEncoder.backgroundValues))) {
                return java.lang.Boolean.valueOf(value);
            }
        }
    }
    return null;
}