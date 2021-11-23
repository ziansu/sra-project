public static boolean isVisibleInHierarchy(org.eclipse.wst.jsdt.core.dom.IFunctionBinding member, org.eclipse.wst.jsdt.core.dom.IPackageBinding pack) {
    int otherflags = member.getModifiers();
    if ((org.eclipse.wst.jsdt.core.dom.Modifier.isPublic(otherflags)) || (org.eclipse.wst.jsdt.core.dom.Modifier.isProtected(otherflags))) {
        return true;
    }else
        if (org.eclipse.wst.jsdt.core.dom.Modifier.isPrivate(otherflags)) {
            return false;
        }
    
    org.eclipse.wst.jsdt.core.dom.ITypeBinding declaringType = member.getDeclaringClass();
    return (declaringType != null) && (pack == (declaringType.getPackage()));
}