public void buildQuad(int index, com.nucleus.shader.ShaderProgram program, com.nucleus.vecmath.Rectangle rectangle) {
    int vertexStride = program.getVertexStride();
    float[] quadPositions = com.nucleus.geometry.MeshBuilder.createQuadPositionsIndexed(rectangle, vertexStride, 0);
    com.nucleus.geometry.MeshBuilder.buildQuad(this, program, index, quadPositions);
    prepareUV(mapper, 1, index);
}