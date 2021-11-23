public void visitDeclaration(org.sosy_lab.cpachecker.cfa.ast.c.CVariableDeclaration decl) {
    if ((decl.getInitializer()) != null) {
        decl.getInitializer().accept(collector);
    }
    collectedFunctions.addAll(collector.collectedFunctions);
    collector.collectedFunctions.clear();
}