@java.lang.Override
public com.graphhopper.reader.RoutingElement create(java.lang.String name, java.lang.String idStr, javax.xml.stream.XMLStreamReader parser) throws javax.xml.stream.XMLStreamException, org.opengis.geometry.MismatchedDimensionException, org.opengis.referencing.FactoryException, org.opengis.referencing.operation.TransformException {
    idStr = idStr.substring(3);
    com.graphhopper.reader.osgb.dpn.OsDpnRoutingElementFactory.logger.info(((":" + name) + ":"));
    switch (name) {
        case "RouteNode" :
            {
                return com.graphhopper.reader.osgb.dpn.OsDpnNode.create(idStr, parser);
            }
        case "RouteLink" :
            {
                return com.graphhopper.reader.osgb.dpn.OsDpnWay.create(idStr, parser);
            }
        case "Route" :
            {
            }
        default :
            {
            }
    }
    return null;
}