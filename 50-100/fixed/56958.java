public com.laneve.asp.ASMAnalysis.asmTypes.AnValue getField(java.lang.String n) {
    if (!(n.contains("\\.")))
        return field.get(n);
    
    int dot = n.indexOf("\\.");
    java.lang.String o1 = n.substring(0, (dot - 1));
    java.lang.String f = n.substring((dot + 1));
    return field.get(o1).getField(f);
}