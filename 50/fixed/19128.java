public void saveConfig() {
    try {
        config.save(cFile);
    } catch (java.io.IOException e) {
        de.mark615.xpermission.object.XUtil.severe("Could not save config.yml!", e);
    }
}