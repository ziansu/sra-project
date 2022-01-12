protected float angleTo(objects.GameObject object) {
    return ((float) (java.lang.Math.toDegrees(java.lang.Math.atan2(((this.pos_y) - (object.pos_y)), ((this.pos_x) - (object.pos_x)))))) + 90;
}