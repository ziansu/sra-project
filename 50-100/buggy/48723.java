boolean attachComponent(org.gearvrf.GVRComponent component) {
    boolean added = org.gearvrf.NativeSceneObject.attachComponent(getNative(), component.getNative());
    if (added) {
        long type = component.getType();
        mComponents.put(type, component);
        component.setOwnerObject(this);
        return true;
    }
    return false;
}