private synchronized void setExportProperties(org.gephi.preview.api.PreviewModel m) {
    org.gephi.preview.api.PreviewProperties props = m.getProperties();
    props.putValue(PreviewProperty.VISIBILITY_RATIO, 1.0F);
    props.putValue("width", width);
    props.putValue("height", height);
    oldColor = props.getColorValue(PreviewProperty.BACKGROUND_COLOR);
    if (transparentBackground) {
        props.putValue(PreviewProperty.BACKGROUND_COLOR, new java.awt.Color(255, 255, 255, 0));
    }
    props.putValue(PreviewProperty.MARGIN, new java.lang.Float(margin));
}