public com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> transform(com.redhat.ceylon.compiler.typechecker.tree.Tree.AttributeSetterDefinition decl) {
    com.sun.tools.javac.tree.JCTree.JCBlock body = statementGen().transform(decl.getBlock());
    java.lang.String name = decl.getIdentifier().getText();
    return com.redhat.ceylon.compiler.codegen.AttributeDefinitionBuilder.setter(this, name, decl.getDeclarationModel().getParameter()).modifiers(transformAttributeGetSetDeclFlags(decl)).setterBlock(body).build();
}