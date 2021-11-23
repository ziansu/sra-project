private void setProperty(org.eclipse.jdt.core.dom.ASTNode node, java.lang.String name, java.lang.Object value) {
    map.get(node).setProperty(name, value);
}