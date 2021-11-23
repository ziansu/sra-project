private boolean isNewer(org.eclipse.core.runtime.IPath name, long currentTimestamp) {
    java.lang.Long prevTimestamp = buildDirNames.get(name);
    return (prevTimestamp == null) || ((prevTimestamp.longValue()) > currentTimestamp);
}