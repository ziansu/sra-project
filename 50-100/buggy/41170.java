private java.util.Set<java.lang.String> getDirectSupers(org.eclipse.objectteams.otredyn.bytecode.asm.ASMByteCodeAnalyzer.ClassInformation ci) {
    java.util.Set<java.lang.String> result = new java.util.HashSet<java.lang.String>();
    java.lang.String superClass = ci.getSuperClassName();
    if ((superClass != null) && (!(superClass.equals(org.eclipse.objectteams.otredyn.transformer.names.ClassNames.OBJECT_SLASH))))
        result.add(superClass);
    
    for (java.lang.String ifc : ci.getSuperInterfaceNames())
        result.add(ifc);
    
    return result;
}