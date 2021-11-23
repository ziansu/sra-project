private void addNewTab(java.lang.String t, movieindexer.AddMenu am) {
    if (!(movieindexer.JsonManager.createEmptyJson(t))) {
        return ;
    }
    cbOptions.add(t);
    javafx.scene.control.Tab newTab = new javafx.scene.control.Tab();
    newTab.setText(t);
    movieindexer.ImdbList ml = new movieindexer.ImdbList(tabs, am, t);
    newTab.setContent(ml);
    tabs.getTabs().add(newTab);
}