private void lockDocumentButtonHandler(boolean left) {
    setGenericObjects(left);
    int ind = tabPanel.getTabBar().getSelectedTab();
    edu.caltech.cs141b.hw2.gwt.collab.shared.AbstractDocument doc = docList.get(ind);
    if (doc instanceof edu.caltech.cs141b.hw2.gwt.collab.shared.UnlockedDocument)
        edu.caltech.cs141b.hw2.gwt.collab.client.DocLocker.lockDoc(this, doc.getKey(), side, ind);
    
}