private void createEditingPart() {
    org.eclipse.swt.widgets.Control[] children = i18nEntryComposite.getChildren();
    for (int i = 0; i < (children.length); i++) {
        children[i].dispose();
    }
    presenter.createEditingPages();
}