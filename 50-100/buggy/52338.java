public void addTab(java.lang.String name, boolean showButton) {
    client.gui.panels.ChatPanel.ChatTab newTab = new client.gui.panels.ChatPanel.ChatTab();
    tabPane.addTab(name, newTab);
    int index = tabPane.indexOfTab(name);
    tabs.put(index, newTab);
    if (showButton)
        tabPane.setTabComponentAt(index, new client.gui.panels.ChatPanel.TabButtonComponent(name));
    
}