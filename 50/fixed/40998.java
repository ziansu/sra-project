public final void setPosition(com.snakybo.sengine.math.Vector3f position) {
    if (!(changed)) {
        if (!(position.equals(this.position))) {
            changed = true;
        }
    }
    this.position = position;
}