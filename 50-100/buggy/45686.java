public java.lang.String[] getSettings(java.lang.String element) {
    java.lang.System.out.println(element);
    java.util.List<file.configtree.ConfigTree.Setting> settinglist = config.getElement((('[' + element) + ']')).getSettings();
    java.lang.String[] settings = new java.lang.String[settinglist.size()];
    for (int i = 0; i < (settinglist.size()); i++) {
        settings[i] = settinglist.get(i).getAttribute();
    }
    return settings;
}