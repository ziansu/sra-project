@java.lang.Override
public org.nschmidt.csgn.Triangle clone() {
    java.util.List<org.nschmidt.csgn.Vector3d> newVertices = new java.util.ArrayList<org.nschmidt.csgn.Vector3d>(vertices.size());
    for (org.nschmidt.csgn.Vector3d vertex : vertices) {
        newVertices.add(vertex.clone());
    }
    return new org.nschmidt.csgn.Triangle(df, newVertices.get(0), newVertices.get(1), newVertices.get(2), new org.nschmidt.ldparteditor.data.GColourIndex(colour.getColour(), colour.getIndex()));
}