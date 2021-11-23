public static java.util.Collection<java.lang.String> getToolString() {
    java.util.Collection<java.lang.String> toolStr = Main.pref.getCollection("toolbar", java.util.Arrays.asList(org.openstreetmap.josm.gui.preferences.ToolbarPreferences.deftoolbar));
    if ((toolStr == null) || ((toolStr.size()) == 0)) {
        toolStr = java.util.Arrays.asList(org.openstreetmap.josm.gui.preferences.ToolbarPreferences.deftoolbar);
    }
    return toolStr;
}