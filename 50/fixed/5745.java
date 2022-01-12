public boolean removeMaterial(java.lang.String name) {
    if (name == null) {
        return false;
    }
    org.bukkit.Material m = org.bukkit.Material.matchMaterial(name);
    return this.remove(m.name());
}