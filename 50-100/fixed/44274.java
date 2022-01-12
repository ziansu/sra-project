protected void doPick() {
    org.gearvrf.GVRSceneObject owner = getOwnerObject();
    org.gearvrf.GVRTransform trans = (owner != null) ? owner.getTransform() : null;
    org.gearvrf.GVRPicker.GVRPickedObject[] picked = org.gearvrf.GVRPicker.pickObjects(mScene, trans, mRayOrigin.x, mRayOrigin.y, mRayOrigin.z, mRayDirection.x, mRayDirection.y, mRayDirection.z);
    generatePickEvents(picked);
}