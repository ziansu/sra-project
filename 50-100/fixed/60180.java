@java.lang.Override
public java.lang.String getOption(java.lang.String option, java.lang.String worldName) {
    if ((options) == null) {
        loadOptions();
    }
    if ((worldName != null) && (worldName.isEmpty())) {
        worldName = null;
    }
    java.util.Map<java.lang.String, java.lang.String> worldOpts = options.get(worldName);
    if (worldOpts == null) {
        return null;
    }
    return worldOpts.get(option);
}