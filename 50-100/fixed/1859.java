private void checkAllTab() throws edu.brandeis.cs.nlp.mae.database.MaeDBException {
    edu.brandeis.cs.nlp.mae.view.TablePanelView.TogglingTabTitle allTab = getTagTabTitle(0);
    if ((getActiveExtentTags().size()) == (getMainController().colorableTagTypes())) {
        allTab.setHighlighted(true);
    }
    if ((getActiveExtentTags().size()) == 0) {
        allTab.setHighlighted(false);
    }
}