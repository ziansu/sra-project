public com.laneve.asp.ASMAnalysis.asmTypes.AnValue getField(java.lang.String name) {
    if (!(name.contains("\\.")))
        return field.get(name);
    
    int dot = name.indexOf("\\.");
    java.lang.String o1 = name.substring(0, (dot - 1));
    java.lang.String f = name.substring((dot + 1));
    return field.get(o1).getField(f);
}