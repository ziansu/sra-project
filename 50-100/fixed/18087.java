private void addValuableEntry(final org.bonitasoft.web.toolkit.client.ui.component.form.FormNode node) {
    if (isValuable(node)) {
        entriesIndex.put(node.getJsId().toString(), ((org.bonitasoft.web.toolkit.client.ui.component.form.entry.ValuedFormEntry) (node)));
    }
    if (isContainer(node)) {
        addValuableEntries(((org.bonitasoft.web.toolkit.client.ui.component.form.entry.Section) (node)).getComponents());
    }
}