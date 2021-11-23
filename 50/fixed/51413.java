public boolean areEqual() {
    if ((baseVersion) == null) {
        return (targetVersion) == null;
    }
    return baseVersion.equals(targetVersion);
}