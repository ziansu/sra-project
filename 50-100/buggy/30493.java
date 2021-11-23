private void setInitialActivations() {
    previousActivations = new java.util.HashMap<>();
    for (Vertex v : vertices) {
        if (specialVertices.contains(v)) {
            previousActivations.put(v, 1.0);
        }else {
            previousActivations.put(v, INITIAL_STATE);
        }
    }
    currentActivations = previousActivations;
}