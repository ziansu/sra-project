protected melnorme.lang.ide.core.operations.build.ValidatedBuildTarget getValidatedBuildTarget() throws melnorme.utilbox.core.CommonException {
    return getBuildManager().getValidatedBuildTarget(getValidProject(), getValidBuildTarget());
}