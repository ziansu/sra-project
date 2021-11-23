private void setProperty(org.eclipse.jdt.core.dom.ASTNode node, java.lang.String name, java.lang.Object value) {
    if (value != null) {
        map.get(node).setProperty(name, value);
    }
}