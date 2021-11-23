public void createCbButtons() {
    java.lang.String[] theType = editor.getTypes();
    filterMenu.removeAll();
    filterList.clear();
    for (int i = 0; i < (theType.length); i++) {
        final java.lang.String typeName = theType[i];
        javax.swing.JCheckBoxMenuItem button = new javax.swing.JCheckBoxMenuItem(typeName);
        button.addActionListener(new GUI.Menu.FilterListener());
        filterMenu.add(button);
    }
}