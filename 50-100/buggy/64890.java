public void save() {
    org.bukkit.configuration.file.YamlConfiguration yaml = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(new java.io.File(getStr(VTData.FILE_PATH)));
    remove(toString(VTData.SCRIPTS));
    for (java.lang.Object o : keySet()) {
        yaml.set(toString(o), get(toString(o)));
    }
    yaml.set("FILE_PATH", null);
    try {
        yaml.save(new java.io.File(getStr(VTData.FILE_PATH)));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}