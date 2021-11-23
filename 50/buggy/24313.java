private jace.config.Configuration.ConfigNode findChild(java.lang.String childName) {
    for (jace.config.Configuration.ConfigNode node : children) {
        if (childName.equalsIgnoreCase(node.toString())) {
            return node;
        }
    }
    return null;
}