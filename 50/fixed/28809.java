private void fillPoly(com.badlogic.gdx.graphics.g2d.PolygonSprite poly, com.badlogic.gdx.graphics.Color color) {
    polyBatch.setColor(color);
    polyBatch.draw(poly.getRegion(), poly.getOriginX(), poly.getOriginY());
}