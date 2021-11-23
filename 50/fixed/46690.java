public void showStartPage() {
    entryComponent = new de.uni_potsdam.hpi.bpt.resource_management.vaadin.BPTSmallRandomEntries(this);
    mainFrame.add(entryComponent);
    getSidebar().showAll(true);
    getPage().setUriFragment("", false);
}