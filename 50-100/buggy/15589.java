private com.sun.tools.javac.tree.JCTree generateField() {
    long flags = (com.sun.tools.javac.code.Flags.PRIVATE) | ((modifiers) & (com.sun.tools.javac.code.Flags.STATIC));
    if (!(writable)) {
        flags |= com.sun.tools.javac.code.Flags.FINAL;
    }
    return owner.make().VarDef(owner.make().Modifiers(flags), fieldName, attrType, variableInit);
}