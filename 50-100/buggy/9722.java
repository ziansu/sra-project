public void centerModel(org.gearvrf.GVRSceneObject model) {
    org.gearvrf.GVRSceneObject.BoundingVolume bv = model.getBoundingVolume();
    float sf = 1 / (bv.radius);
    model.getTransform().setScale(sf, sf, sf);
    bv = model.getBoundingVolume();
    model.getTransform().setPosition((-(bv.center.x)), (-(bv.center.y)), ((-(bv.center.z)) - (1.5F * (bv.radius))));
}