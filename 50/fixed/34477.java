public boolean isSuperHuman(java.lang.String name) {
    for (java.lang.String heroes : SuperHumans.instance.getConfig().getConfigurationSection("superhumans").getKeys(false)) {
        if (heroes.equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
}