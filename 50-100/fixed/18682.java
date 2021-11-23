public final com.badlogic.gdx.math.Polygon create(final java.lang.String regionName, final com.badlogic.gdx.math.Vector2 size) {
    if (!(convexHulls.containsKey(regionName))) {
        com.badlogic.gdx.graphics.g2d.TextureRegion textureRegion = textureCache.getTextureRegion(regionName);
        float[] convexHull = dclib.graphics.TextureGeometry.createConvexHull(textureRegion);
        convexHulls.put(regionName, convexHull);
    }
    float[] vertices = dclib.geometry.VertexUtils.setSize(convexHulls.get(regionName), size);
    return new com.badlogic.gdx.math.Polygon(vertices);
}