@java.lang.Override
public java.lang.String getOption(java.lang.String option, java.lang.String worldName) {
    if (worldsOptions.containsKey(worldName)) {
        java.util.Map<java.lang.String, java.lang.String> worldOption = worldsOptions.get(worldName);
        if (worldOption.containsKey(option)) {
            return worldOption.get(option);
        }
    }
    return null;
}