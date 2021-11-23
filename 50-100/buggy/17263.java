private static autograph.Edge getEdgeElement(org.w3c.dom.Element el, autograph.Graph graph) {
    autograph.Edge edge;
    java.lang.String id = el.getAttribute("id");
    java.lang.String targetNode;
    if (id != null) {
        edge = new autograph.Edge(id, null, null, null);
    }else {
        edge = new autograph.Edge(null, null, null, null);
    }
    return edge;
}