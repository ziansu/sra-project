public void propagateSelectionFromTextPanel() {
    try {
        java.util.List<edu.brandeis.cs.nlp.mae.controller.ExtentTag> releventTags = getDriver().getTagsIn(getSelectedTextSpans());
        for (edu.brandeis.cs.nlp.mae.controller.ExtentTag tag : releventTags) {
            getTablePanel().selectTagFromTable(tag);
        }
        getStatusBar().reset();
    } catch (java.lang.Exception e) {
        showError(e);
    }
}