@java.lang.Override
public java.lang.Object visitClassType(miniJava.AbstractSyntaxTrees.ClassType type, java.lang.Object arg) {
    type.className.decl = ScopeID.getClass(type.className.spelling);
    return null;
}