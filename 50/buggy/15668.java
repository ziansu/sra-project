@java.lang.Override
public java.lang.String extractMainClassSegments() {
    org.eclipse.core.runtime.IPath classPath = getCodePath().removeFirstSegments(1);
    java.lang.String className = classPath.toString().replace('/', '.');
    return className;
}