private static java.lang.String normalizeName(org.bukkit.Material material) {
    java.lang.String name = material.toString().toLowerCase().replaceAll("block", "");
    if (name.contains("sign")) {
        name = "Sign";
    }
    if (name.contains("furnace")) {
        name = "furnace";
    }
    if (name.endsWith("_")) {
        name = name.substring(0, ((name.length()) - 1));
    }
    return name.toLowerCase();
}