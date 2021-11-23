private com.sun.tools.javac.util.List<com.sun.tools.javac.tree.JCTree> makeGetter(com.redhat.ceylon.compiler.typechecker.tree.Tree.AttributeDeclaration decl) {
    at(decl);
    java.lang.String atrrName = decl.getIdentifier().getText();
    return com.redhat.ceylon.compiler.codegen.AttributeDefinitionBuilder.getter(this, atrrName, decl.getDeclarationModel()).modifiers(transformAttributeGetSetDeclFlags(decl)).isActual(com.redhat.ceylon.compiler.util.Decl.isActual(decl)).isFormal(com.redhat.ceylon.compiler.util.Decl.isFormal(decl)).build();
}