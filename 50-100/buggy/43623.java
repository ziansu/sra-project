private java.io.File createSelectedSource() {
    java.io.File source = new java.io.File(urlModel.getString());
    source = slash.common.io.Files.findExistingPath(source);
    java.io.File path = new java.io.File(slash.navigation.converter.gui.panels.ConvertPanel.preferences.get(slash.navigation.converter.gui.panels.ConvertPanel.READ_PATH_PREFERENCE, ""));
    path = slash.common.io.Files.findExistingPath(path);
    if (path == null)
        return source;
    else
        if (source != null)
            return new java.io.File(path, source.getName());
        else
            return path;
        
    
}