private void addEdgeEdger2(java.util.TreeSet<org.nschmidt.ldparteditor.data.Vertex> h1, java.util.TreeSet<org.nschmidt.ldparteditor.data.Vertex> h2) {
    for (org.nschmidt.ldparteditor.data.Vertex v1 : h1) {
        for (org.nschmidt.ldparteditor.data.Vertex v2 : h2) {
            if (isNeighbour(v1, v2)) {
                addLine(v1, v2);
            }
        }
    }
}