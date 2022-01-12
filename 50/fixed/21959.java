@java.lang.Override
public org.eclipse.core.runtime.IPath getRedirectedPath(org.eclipse.core.runtime.IPath source) {
    return source.equals(filePath) ? newPath : source;
}