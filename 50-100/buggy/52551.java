private void setProperty(java.lang.String property, java.lang.Object value) {
    for (java.lang.String prop : properties.getKeys(false)) {
        if (prop.equalsIgnoreCase(property)) {
            CityZen.citizenConfig.getConfig().set((((properties.getCurrentPath()) + ".") + property), value);
            io.github.griffenx.CityZen.Citizen.citizenConfig = CityZen.citizenConfig.getConfig();
        }
    }
}