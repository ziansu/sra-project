protected void prepareTargetPropertyTypes() {
    targetPropertyTypes = helper.getTargetPropertyTypes(entity);
    if (!(targetPropertyTypes.isEmpty())) {
        executable = true;
        sqlExecutionSkipCause = null;
    }
}