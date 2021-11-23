public boolean hasBone(java.lang.String name) {
    boolean result;
    if (name.equals(maud.model.SelectedSkeleton.noBone)) {
        result = true;
    }else {
        com.jme3.animation.Skeleton skeleton = findSkeleton();
        if (skeleton == null) {
            result = false;
        }else {
            com.jme3.animation.Bone bone = skeleton.getBone(name);
            if (bone == null) {
                result = false;
            }else {
                result = true;
            }
        }
    }
    return result;
}