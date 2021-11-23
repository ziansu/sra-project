private java.lang.String getShortColumnAccess(boolean isModelContainerAdapter) {
    return isModelContainerAdapter ? modelContainerAccess.getShortAccessString(isModelContainerAdapter, foreignColumnName) : columnAccess.getShortAccessString(isModelContainerAdapter, foreignColumnName);
}