public com.jme3.math.Transform boneTransform(int boneIndex, com.jme3.math.Transform storeResult) {
    if (storeResult == null) {
        storeResult = new com.jme3.math.Transform();
    }
    com.jme3.animation.Animation animation = getLoadedAnimation();
    com.jme3.animation.BoneTrack track = jme3utilities.MyAnimation.findTrack(animation, boneIndex);
    if (track == null) {
        storeResult.loadIdentity();
    }else {
        maud.Util.boneTransform(track, time, storeResult);
    }
    return storeResult;
}