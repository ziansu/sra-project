public void setRotation(float radians) {
    rotMatrix = main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.rotationZ(radians);
    modelMatrix = main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.mult(main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.scale(scale), main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.translation(origin));
    modelMatrix = main.java.org.cytoscape.pokemeow.internal.algebra.Matrix4.mult(modelMatrix, rotMatrix);
}