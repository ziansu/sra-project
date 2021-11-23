private fr.free.nrw.commons.location.LatLng getCoordinates(org.w3c.dom.Node parentNode) throws java.io.IOException {
    org.w3c.dom.NodeList childNodes = parentNode.getChildNodes();
    double latitudeText = java.lang.Double.parseDouble(childNodes.item(1).getTextContent());
    double longitudeText = java.lang.Double.parseDouble(childNodes.item(2).getTextContent());
    return new fr.free.nrw.commons.location.LatLng(latitudeText, longitudeText, 0);
}