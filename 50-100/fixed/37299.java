public void switchGround(java.util.List<com.quailshillstudio.polygonClippingUtils.PolygonBox2DShape> rs) {
    mustCreate = true;
    java.util.List<float[]> verts = new java.util.ArrayList();
    for (com.quailshillstudio.polygonClippingUtils.PolygonBox2DShape r : rs) {
        verts.add(r.verticesToLoop());
    }
    com.quailshillstudio.polygonClippingUtils.GroundFixture grFix = new com.quailshillstudio.polygonClippingUtils.GroundFixture(verts);
    this.polyVerts.add(grFix);
}