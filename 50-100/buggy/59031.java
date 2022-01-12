private void appendToLists(org.eclipse.cdt.core.dom.ast.IASTName name, org.eclipse.cdt.core.dom.ast.IBinding binding, org.eclipse.cdt.core.dom.ast.IASTNode node) {
    boolean added = this.namesSet.add(name);
    this.namesList.add(name);
    if (added) {
        this.bindingsSet.add(binding);
        this.nodesList.add(node);
    }
}