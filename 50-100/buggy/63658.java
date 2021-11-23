public void setIgsDefaults() {
    for (com.wasteofplastic.askyblock.Island.SettingsFlag flag : com.wasteofplastic.askyblock.Island.SettingsFlag.values()) {
        if (!(Settings.defaultIslandSettings.containsKey(flag))) {
            this.igs.put(flag, false);
        }else {
            this.igs.put(flag, Settings.defaultIslandSettings.get(flag));
        }
    }
}