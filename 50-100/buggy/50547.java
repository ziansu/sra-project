public static org.eclipse.cdt.core.dom.ast.cpp.ICPPMethod[] findOverriders(org.eclipse.cdt.core.index.IIndex index, org.eclipse.cdt.core.dom.ast.cpp.ICPPMethod method, org.eclipse.cdt.core.dom.ast.IASTNode point) throws org.eclipse.core.runtime.CoreException {
    if (!(org.eclipse.cdt.internal.core.dom.parser.cpp.ClassTypeHelper.isVirtual(method)))
        return org.eclipse.cdt.core.dom.ast.cpp.ICPPMethod.EMPTY_CPPMETHOD_ARRAY;
    
    final org.eclipse.cdt.core.dom.ast.cpp.ICPPClassType mcl = method.getClassOwner();
    if (mcl == null)
        return org.eclipse.cdt.core.dom.ast.cpp.ICPPMethod.EMPTY_CPPMETHOD_ARRAY;
    
    org.eclipse.cdt.core.dom.ast.cpp.ICPPClassType[] subclasses = org.eclipse.cdt.internal.core.dom.parser.cpp.ClassTypeHelper.getSubClasses(index, mcl);
    return org.eclipse.cdt.internal.core.dom.parser.cpp.ClassTypeHelper.findOverriders(subclasses, method, null);
}