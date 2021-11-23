public void visitDataDecl(AppleCoreCompiler.Semantics.DataDecl node) throws AppleCoreCompiler.Semantics.SemanticError {
    printStatus("Adding symbol for ", node);
    addMapping(node.label, node, map);
}