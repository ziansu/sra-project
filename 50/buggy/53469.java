private java.lang.String getSlashedClassName(org.apache.bcel.generic.FieldOrMethod obj) {
    java.lang.String className = obj.getReferenceType(cpg).toString();
    return edu.umd.cs.findbugs.util.ClassName.toSlashedClassName(className);
}