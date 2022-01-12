public static jloda.gui.ColorTable getColorTable(java.lang.String name) {
    jloda.gui.ColorTableManager.init();
    if ((name != null) && (jloda.gui.ColorTableManager.name2ColorTable.keySet().contains(name))) {
        jloda.util.ProgramProperties.put("DefaultColorTableName", name);
        return jloda.gui.ColorTableManager.name2ColorTable.get(name);
    }else
        return jloda.gui.ColorTableManager.name2ColorTable.get(jloda.gui.ColorTableManager.DefaultColorTableName);
    
}