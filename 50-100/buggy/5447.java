private void saveCategories() {
    org.bukkit.configuration.Configuration config = plugin.getConfig();
    for (me.semakon.localStorage.Category category : categories) {
        if (category.equals(defaultCategory))
            continue;
        
        config.set((((me.semakon.Utils.CATEGORIES) + (category.getId())) + ".Name"), category.getName());
        config.set((((me.semakon.Utils.CATEGORIES) + (category.getId())) + ".Description"), category.getDescription());
    }
}