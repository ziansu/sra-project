public void load() {
    latmod.lib.config.ConfigList list = ((latmod.lib.config.ConfigList) (latmod.lib.config.LMJsonUtils.fromJsonFile(file, latmod.lib.config.ConfigList.class)));
    if (list != null) {
        list.setID(latmod.lib.config.ID);
        if (configList.loadFromList(list))
            save();
        
    }
}