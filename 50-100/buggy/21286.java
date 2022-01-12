public boolean hasBone(java.lang.String name) {
    if (name.equals(maud.model.SelectedSkeleton.noBone)) {
        return true;
    }
    com.jme3.animation.Skeleton skeleton = findSkeleton();
    com.jme3.animation.Bone bone = skeleton.getBone(name);
    if (bone == null) {
        return false;
    }else {
        return true;
    }
}