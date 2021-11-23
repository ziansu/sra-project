private void setInitialActivations() {
    previousActivations = new java.util.HashMap<>();
    currentActivations = new java.util.HashMap<>();
    for (Vertex v : vertices) {
        if (specialVertices.contains(v)) {
            currentActivations.put(v, 1.0);
        }else {
            currentActivations.put(v, INITIAL_STATE);
        }
    }
}