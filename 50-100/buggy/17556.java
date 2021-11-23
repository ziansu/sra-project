private com.typesafe.config.impl.AbstractConfigValue parseConcatenation(com.typesafe.config.impl.ConfigNodeConcatenation n) {
    if ((flavor) == (com.typesafe.config.ConfigSyntax.JSON))
        return null;
    
    java.util.List<com.typesafe.config.impl.AbstractConfigValue> values = new java.util.ArrayList<com.typesafe.config.impl.AbstractConfigValue>();
    for (com.typesafe.config.impl.AbstractConfigNode node : n.children()) {
        com.typesafe.config.impl.AbstractConfigValue v = null;
        if (node instanceof com.typesafe.config.impl.AbstractConfigNodeValue) {
            v = parseValue(((com.typesafe.config.impl.AbstractConfigNodeValue) (node)));
        }
        values.add(v);
    }
    return com.typesafe.config.impl.ConfigConcatenation.concatenate(values);
}