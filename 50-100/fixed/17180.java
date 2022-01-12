private void setExample(final org.opentravel.schemas.widgets.OtmEventData wd) {
    final org.opentravel.schemas.node.Node n = ((org.opentravel.schemas.node.Node) (mc.getCurrentNode_PropertiesView()));
    final java.lang.String text = wd.getText();
    if (n instanceof org.opentravel.schemas.node.properties.PropertyNode)
        ((org.opentravel.schemas.node.properties.PropertyNode) (n)).setExample(text);
    
}