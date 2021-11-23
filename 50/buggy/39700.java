public void calculateOriginData() {
    calculateViewGenerator();
    org.lwjgl.util.vector.Matrix4f realViewport = getRealViewport();
    calculateOrigin(realViewport);
    calculateGrid(realViewport);
    c3d.setNegDeterminant(((realViewport.determinant()) < 0.0F ? 1 : 0));
}