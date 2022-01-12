public static java.lang.String getString(java.lang.String stringName) {
    return com.pwn9.PwnFilter.config.SpongeConfig.rootNode.getNode("Strings").getNode(stringName).getString(("UNKNOWN STRING ;-; " + stringName));
}