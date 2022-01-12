public void setupNMS() {
    java.lang.String version = getServer().getClass().getPackage().getName().split("\\.")[3];
    switch (version) {
        case "v1_10_R1" :
            nms = new me.AlexLander123.StructureSave.NMS.NMS_v1_10_R1();
            break;
        case "v1_11_R1" :
            nms = new me.AlexLander123.StructureSave.NMS.NMS_v1_11_R1();
        default :
            this.logger.severe(((org.bukkit.ChatColor.RED) + "[StructureSave] Unsupported version disabling plugin."));
            getServer().getPluginManager().disablePlugin(this);
    }
}