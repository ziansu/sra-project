public static void setKeyframeToSkeleton(com.gemserk.tools.animationeditor.core.Skeleton skeleton, com.gemserk.tools.animationeditor.core.SkeletonAnimationKeyFrame keyframe) {
    java.util.Set<java.lang.String> keySet = keyframe.jointKeyFrames.keySet();
    for (java.lang.String jointId : keySet) {
        float[] jointKeyFrame = keyframe.getJointKeyFrame(jointId);
        com.gemserk.tools.animationeditor.core.Joint joint = skeleton.getRoot().find(jointId);
        if (joint == null)
            continue;
        
        com.gemserk.tools.animationeditor.core.SkeletonAnimationUtils.jointConverter.copyToObject(joint, jointKeyFrame);
    }
}