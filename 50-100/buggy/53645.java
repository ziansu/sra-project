@java.lang.Override
public void invoke() {
    if ((result != null) && (!(result.isEmpty()))) {
        view.setEmptyVisible(false);
        view.setMarkdown(result);
        loadTableSorters();
        loadMath(wikiKey, isPreview);
        loadWidgets(wikiKey, isPreview);
    }
}