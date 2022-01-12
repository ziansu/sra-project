private boolean containsFieldWithShortName(java.lang.String shortName) {
    if (shortName == null)
        return false;
    
    for (org.jetbrains.java.decompiler.struct.StructField f : fields) {
        if (shortName.equals(f.getName())) {
            return true;
        }
    }
    if ((superClass) != null) {
        org.jetbrains.java.decompiler.main.ClassesProcessor classesProcessor = org.jetbrains.java.decompiler.main.DecompilerContext.getClassProcessor();
        org.jetbrains.java.decompiler.main.ClassesProcessor.ClassNode classNode = classesProcessor.getMapRootClasses().get(superClass.getString());
        if (classNode != null)
            return classNode.classStruct.containsFieldWithShortName(shortName);
        
    }
    return false;
}