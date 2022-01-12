@java.lang.Override
public void visit(final com.redhat.ceylon.compiler.typechecker.tree.Tree.InterfaceDefinition that) {
    if (!((opts.isOptimize()) && (that.getDeclarationModel().isClassOrInterfaceMember()))) {
        com.redhat.ceylon.compiler.js.TypeGenerator.interfaceDefinition(that, this, null);
    }
}