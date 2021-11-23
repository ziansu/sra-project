private void updateLocalToWorld() {
    if ((parent) != null) {
        localToWorld = parent.getLocalToWorld();
    }else {
        localToWorld = new engine.object3d.Matrix4f();
    }
    localToWorld.translate(position);
    localToWorld.rotate(rotation);
    localToWorld.scale(scale);
    localToWorldNeedsUpdate = false;
}