@java.lang.Override
public java.lang.String getPath(org.eclipse.debug.core.model.IBreakpoint breakpoint) throws org.eclipse.core.runtime.CoreException {
    org.eclipse.jdt.debug.core.IJavaBreakpoint bp = ((org.eclipse.jdt.debug.core.IJavaBreakpoint) (breakpoint));
    java.lang.String type = bp.getTypeName();
    if (type != null) {
        int innerClassIndex = type.indexOf('$');
        if (innerClassIndex > 0) {
            type = type.substring(0, innerClassIndex);
        }
        return (type.replace('.', '/')) + ".java";
    }else {
        return null;
    }
}