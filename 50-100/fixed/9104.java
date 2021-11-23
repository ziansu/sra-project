public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (obj instanceof mc.compiler.ast.ReferenceNode) {
        mc.compiler.ast.ReferenceNode node = ((mc.compiler.ast.ReferenceNode) (obj));
        return reference.equals(node.getReference());
    }
    return false;
}