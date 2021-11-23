public void attachBoxCollider(utils.Vector2 size, utils.Vector2 position, float rotation, boolean isSensor) {
    org.jbox2d.common.Vec2 size2 = size.toVec2().mul(0.5F);
    org.jbox2d.common.Vec2 pos2 = position.toVec2();
    org.jbox2d.collision.shapes.PolygonShape polygon = new org.jbox2d.collision.shapes.PolygonShape();
    polygon.setAsBox(size2.x, size2.y, pos2, rotation);
    attachCollider(polygon, isSensor);
}