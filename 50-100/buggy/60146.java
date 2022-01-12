public static jp.hichain.prototype.basic.Position getPosition(int _v, int _h) {
    java.util.EnumMap<jp.hichain.prototype.concept.AroundDir.Axis, java.lang.Integer> targetPos = new java.util.EnumMap<jp.hichain.prototype.concept.AroundDir.Axis, java.lang.Integer>(jp.hichain.prototype.concept.AroundDir.Axis.class) {
        {
            put(Axis.VERTICAL, _v);
            put(Axis.HORIZONTAL, _h);
        }
    };
    for (jp.hichain.prototype.basic.Position pos : jp.hichain.prototype.basic.Position.posDB) {
        if (pos.position.equals(targetPos)) {
            return pos;
        }
    }
    return null;
}