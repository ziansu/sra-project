public org.gearvrf.GVRComponent detachComponent(long type) {
    boolean removed = org.gearvrf.NativeSceneObject.detachComponent(getNative(), type);
    if (removed)
        synchronized(mComponents) {
            org.gearvrf.GVRComponent component = mComponents.remove(type);
            component.setOwnerObject(null);
        }
    
    return null;
}