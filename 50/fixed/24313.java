private jace.config.Configuration.ConfigNode findChild(java.lang.String id) {
    for (jace.config.Configuration.ConfigNode node : children) {
        if (id.equalsIgnoreCase(node.id)) {
            return node;
        }
    }
    return null;
}