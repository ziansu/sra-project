public org.gearvrf.GVRComponent detachComponent(long type) {
    org.gearvrf.NativeSceneObject.detachComponent(getNative(), type);
    synchronized(mComponents) {
        org.gearvrf.GVRComponent component = mComponents.remove(type);
        if (component != null) {
            component.setOwnerObject(null);
        }
        return component;
    }
}