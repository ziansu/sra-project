public void init(Node source, DistanceVector vector) {
    for (java.lang.Long i = 1L; i <= (nodes.size()); i++) {
        DistanceElement element = new DistanceElement(i);
        if (element.getId().equals(source.getId())) {
            element.changeDistance(0.0);
        }
        vector.addElement(element);
    }
}