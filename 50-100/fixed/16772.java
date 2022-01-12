public com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> transform(com.redhat.ceylon.compiler.typechecker.tree.Tree.AttributeGetterDefinition decl) {
    java.lang.String name = decl.getIdentifier().getText();
    com.sun.tools.javac.tree.JCTree.JCBlock body = statementGen().transform(decl.getBlock());
    return com.redhat.ceylon.compiler.codegen.AttributeDefinitionBuilder.getter(this, name, decl.getDeclarationModel()).modifiers(transformAttributeGetSetDeclFlags(decl.getDeclarationModel())).getterBlock(body).build();
}