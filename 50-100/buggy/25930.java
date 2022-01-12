public Location getLocationByName(java.lang.String name) {
    for (GraphNode<Location, Path> v : vertices) {
        if (v.getVertexData().getName().equals(name)) {
            return v.getVertexData();
        }
    }
    return null;
}