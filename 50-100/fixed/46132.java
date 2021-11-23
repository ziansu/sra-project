public void setVisiblePanel(java.lang.String name) {
    for (int i = 0; i < (tabbed.getTabCount()); ++i) {
        if (((tabbed.getComponent(i).getName()) != null) && (tabbed.getComponent(i).getName().equals(name))) {
            tabbed.setSelectedIndex(i);
            return ;
        }
    }
    if ((tabbed.getTabCount()) > 0) {
        tabbed.setSelectedIndex(0);
    }
}