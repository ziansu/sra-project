@java.lang.Override
public com.shootoff.targets.Target addTarget(java.io.File targetFile, javafx.scene.Group targetGroup, java.util.Map<java.lang.String, java.lang.String> targetTags, boolean userDeletable) {
    final java.util.Optional<com.shootoff.targets.io.TargetIO.TargetComponents> targetComponents = com.shootoff.targets.io.TargetIO.loadTarget(targetFile);
    if (targetComponents.isPresent()) {
        final com.shootoff.targets.io.TargetIO.TargetComponents tc = targetComponents.get();
        mirroredManager.mirrorAddTarget(targetFile, tc.getTargetGroup(), tc.getTargetTags(), userDeletable);
    }
    return super.addTarget(targetFile, targetGroup, targetTags, userDeletable);
}