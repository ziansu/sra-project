public java.util.Map<java.lang.String, java.lang.Object> makeGroupList() {
    return ((org.bukkit.configuration.MemorySection) (main.getConfig().get("Groups"))).getValues(false);
}