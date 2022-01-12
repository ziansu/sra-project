private java.lang.String ReadPixelSize() {
    org.w3c.dom.NodeList nodes = GetUpperLevelNodeList("PixelSize", "Missing PixelSize.");
    java.util.ArrayList<java.lang.String> values = GetNodeListValues(nodes, "Missing PixelSize.");
    if ((values.size()) > 0) {
        return values.get(0);
    }
    return null;
}