public ch.logixisland.anuto.util.math.Vector2 proj(ch.logixisland.anuto.util.math.Vector2 v) {
    float f = (this.dot(v)) / (v.len2());
    return v.mul(f);
}