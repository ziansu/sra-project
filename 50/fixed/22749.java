public final void setScale(com.snakybo.sengine.math.Vector3f scale) {
    if (!(changed)) {
        if (!(scale.equals(this.scale))) {
            changed = true;
        }
    }
    this.scale = scale;
}