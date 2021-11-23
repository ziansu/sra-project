public boolean isNeighbour(org.nschmidt.ldparteditor.data.Vertex v1, org.nschmidt.ldparteditor.data.Vertex v2) {
    java.util.Set<org.nschmidt.ldparteditor.data.VertexManifestation> m1 = vertexLinkedToPositionInFile.get(v1);
    java.util.Set<org.nschmidt.ldparteditor.data.VertexManifestation> m2 = vertexLinkedToPositionInFile.get(v2);
    for (org.nschmidt.ldparteditor.data.VertexManifestation a : m1) {
        for (org.nschmidt.ldparteditor.data.VertexManifestation b : m2) {
            if (a.getGdata().equals(b.getGdata())) {
                return true;
            }
        }
    }
    return false;
}