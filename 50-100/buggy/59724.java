public void addHitbox() {
    org.newdawn.slick.geom.Ellipse el = new org.newdawn.slick.geom.Ellipse(((posx) + ((getSize()[0]) / 2)), (((posy) + ((getSize()[1]) / 2)) - 1), mesiah.danmaku.model.Player.HITBOX_RADIUS, mesiah.danmaku.model.Player.HITBOX_RADIUS);
    float[] rel = new float[]{ 0.0F , 0.0F };
    addRelative(rel);
    ss.add(el);
}