public void setOrigin(main.java.org.cytoscape.pokemeow.internal.algebra.Vector3 new_origin) {
    origin = new_origin;
    modelMatrix = main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.mult(main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.translation(origin), main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.scale(scale));
    modelMatrix = main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.mult(modelMatrix, rotMatrix);
}