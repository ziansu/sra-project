protected void saveConfigFile() {
    if (config.hasChanged()) {
        config.save();
    }
}