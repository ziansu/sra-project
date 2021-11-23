public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 1) {
        int index = availablePluginsList.locationToIndex(e.getPoint());
        if (index > (-1)) {
            java.lang.String pluginName = ((java.lang.String) (availablePluginsList.getSelectedValue()));
            availableSelected = pluginName;
            java.lang.String pluginNameFixed = pluginName.replaceAll("_\\d*$", "");
            java.lang.Class<?> clazz = plugins.get(pluginNameFixed);
            updateDescriptionTextInGui(clazz);
        }
    }
}