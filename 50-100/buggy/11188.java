private synchronized org.esa.beam.framework.datamodel.PlacemarkGroup createTextAnnotationGroup() {
    final org.esa.beam.framework.datamodel.VectorDataNode vectorDataNode = new org.esa.beam.framework.datamodel.VectorDataNode(org.esa.beam.framework.datamodel.Product.TEXT_ANNOTATION_GROUP_NAME, org.esa.beam.framework.datamodel.Placemark.createTextAnnotationFeatureType());
    vectorDataNode.setDefaultStyleCss("symbol:plus; stroke:#ff8800; stroke-opacity:0.0; stroke-width:0.0");
    vectorDataNode.setPermanent(true);
    this.vectorDataGroup.add(vectorDataNode);
    return vectorDataNode.getPlacemarkGroup();
}