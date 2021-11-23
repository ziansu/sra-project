private void addNewTab(java.lang.String t, movieindexer.AddMenu am) {
    if (!(movieindexer.JsonManager.createEmptyJson(t))) {
        return ;
    }
    cbOptions.add(t);
    movieindexer.ImdbList ml = new movieindexer.ImdbList(tabs, am, t);
    tabs.getTabs().add(ml);
}