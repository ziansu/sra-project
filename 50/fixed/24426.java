private java.lang.String getShortColumnAccess(boolean isModelContainerAdapter) {
    return isModelContainerAdapter ? foreignColumnName : columnAccess.getShortAccessString(isModelContainerAdapter, foreignColumnName);
}