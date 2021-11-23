public animationeditor.Bone getParent(animationeditor.Skeleton skeleton) {
    if (skeleton.boneList.contains(this)) {
        return null;
    }
    for (animationeditor.Bone bone : skeleton.boneList) {
        while (!(bone.childList.contains(this))) {
            for (animationeditor.Bone child : bone.childList) {
                if ((child.getDescendant(name)) != null) {
                    bone = child;
                }
            }
        } 
        return bone;
    }
    return null;
}