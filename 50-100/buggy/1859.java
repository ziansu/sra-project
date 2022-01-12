private void checkAllTab() throws edu.brandeis.cs.nlp.mae.database.MaeDBException {
    if ((getActiveExtentTags().size()) == (getMainController().colorableTagTypes())) {
        edu.brandeis.cs.nlp.mae.view.TablePanelView.TogglingTabTitle allTab = getTagTabTitle(0);
        allTab.setHighlighted(true);
    }
    if ((getActiveExtentTags().size()) == 0) {
        edu.brandeis.cs.nlp.mae.view.TablePanelView.TogglingTabTitle allTab = getTagTabTitle(0);
        allTab.setHighlighted(false);
    }
}