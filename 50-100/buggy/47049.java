public java.util.HashSet<org.nschmidt.ldparteditor.data.GData> getLinkedSurfaces(org.nschmidt.ldparteditor.data.Vertex vertex) {
    java.util.HashSet<org.nschmidt.ldparteditor.data.GData> rval = new java.util.HashSet<org.nschmidt.ldparteditor.data.GData>();
    java.util.Set<org.nschmidt.ldparteditor.data.VertexManifestation> vm = vertexLinkedToPositionInFile.get(vertex);
    if (vm != null) {
        for (org.nschmidt.ldparteditor.data.VertexManifestation m : vm) {
            int type = m.getGdata().type();
            if ((type > 2) || (type < 5))
                rval.add(m.getGdata());
            
        }
    }
    return rval;
}