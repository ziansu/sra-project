public void showAll(boolean loadEntries) {
    entryComponent = new de.uni_potsdam.hpi.bpt.resource_management.vaadin.BPTEntryCards(this, loadEntries);
    mainFrame.add(entryComponent);
    getSidebar().showAll(loadEntries);
    getPage().setUriFragment("#!showAll", false);
}