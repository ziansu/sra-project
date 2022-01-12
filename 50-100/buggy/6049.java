private static org.w3c.dom.Element createPoiNode(org.w3c.dom.Document doc, test.abaturin.WikivoyagePOI poi) {
    org.w3c.dom.Element node = doc.createElement("node");
    node.setAttribute("id", test.abaturin.Main.nodeId.toString());
    node.setAttribute("visible", "true");
    node.setAttribute("lat", new java.lang.Float(poi.getLatitude()).toString());
    node.setAttribute("lon", new java.lang.Float(poi.getLongitude()).toString());
    (test.abaturin.Main.nodeId)++;
    return node;
}