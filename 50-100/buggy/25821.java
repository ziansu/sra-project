private void buildMesh(com.nucleus.shader.ShaderProgram program, int spriteCount, com.nucleus.vecmath.Rectangle rectangle) {
    int vertexStride = program.getVertexStride();
    float[] quadPositions = com.nucleus.geometry.MeshBuilder.createQuadPositionsIndexed(rectangle, vertexStride, 0);
    com.nucleus.geometry.MeshBuilder.buildQuadMeshIndexed(this, program, 0, spriteCount, quadPositions);
    prepareUV(mapper, spriteCount);
}