public void setVisiblePanel(java.lang.String name) {
    for (int i = 0; i < (tabbed.getTabCount()); ++i) {
        if (name.equals(tabbed.getComponent(i).getName())) {
            tabbed.setSelectedIndex(i);
            return ;
        }
    }
    if ((tabbed.getTabCount()) > 0) {
        tabbed.setSelectedIndex(0);
    }
}