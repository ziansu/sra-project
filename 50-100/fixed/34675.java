private com.munkhbat.minijava.typecheck.Method getMethodIncludingSubType(java.lang.Class clas, java.lang.String methodId) {
    java.lang.Class tmpClass = clas;
    while (tmpClass != null) {
        com.munkhbat.minijava.typecheck.Method method = tmpClass.getMethod(methodId);
        if (method != null) {
            return method;
        }
        if ((tmpClass.parent()) == null) {
            return null;
        }
        tmpClass = symbolTable.getClass(tmpClass.parent());
    } 
    return null;
}