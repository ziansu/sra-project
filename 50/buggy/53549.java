protected melnorme.lang.ide.core.operations.build.ValidatedBuildTarget getValidatedBuildTarget() throws melnorme.utilbox.core.CommonException {
    melnorme.lang.ide.core.operations.build.BuildTarget buildTarget = getValidBuildTarget();
    return getBuildManager().getValidatedBuildTarget(getValidProject(), buildTarget);
}