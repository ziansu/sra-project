private org.eclipse.jdt.core.IType findPrimaryType(java.lang.String packageName, java.lang.String typeName) throws org.eclipse.jdt.core.JavaModelException {
    org.eclipse.jdt.internal.core.JavaProject casted = ((org.eclipse.jdt.internal.core.JavaProject) (javaProject));
    org.eclipse.jdt.internal.core.NameLookup nameLookup = getNameLookup(casted);
    org.eclipse.jdt.internal.core.NameLookup.Answer answer = nameLookup.findType(typeName, packageName, false, org.eclipse.jdt.internal.core.NameLookup.ACCEPT_ALL, false, true, false, null);
    return answer == null ? null : answer.type;
}