public void setString(org.golde.java.scratchforge.Config.ConfigProperty setting, java.lang.String to) {
    try {
        output = new java.io.FileOutputStream(CONFIG_NAME);
        prop.setProperty(setting.name(), to);
        prop.store(output, null);
        output.close();
    } catch (java.lang.Exception e) {
        org.golde.java.scratchforge.helpers.PLog.errorPopup(e, (((("Failed to set " + (setting.name())) + " to ") + to) + "!"));
    }
}