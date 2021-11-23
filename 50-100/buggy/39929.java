public void selectByName(java.lang.String childName) {
    int i = 0;
    org.gearvrf.GVRSceneObject owner = getOwnerObject();
    if (owner == null) {
        return ;
    }
    for (org.gearvrf.GVRSceneObject child : owner.children()) {
        if ((child.getName()) == childName) {
            mSwitchIndex = i;
            return ;
        }
        ++i;
    }
}