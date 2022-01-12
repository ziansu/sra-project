private static org.w3c.dom.Element createPoiNode(org.w3c.dom.Document doc, test.abaturin.WikivoyagePOI poi) {
    org.w3c.dom.Element node = doc.createElement("node");
    node.setAttribute("id", test.abaturin.Main.nodeId.toString());
    node.setAttribute("visible", "true");
    node.setAttribute("lat", java.lang.Float.toString(poi.getLatitude()));
    node.setAttribute("lon", java.lang.Float.toString(poi.getLongitude()));
    (test.abaturin.Main.nodeId)++;
    return node;
}