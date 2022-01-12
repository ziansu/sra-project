@java.lang.Override
public void insertUpdate(javax.swing.event.DocumentEvent e) {
    searchListToCheck.clearSelection();
    java.lang.String search = searchBarCheck.getText();
    java.awt.CardLayout cl = ((java.awt.CardLayout) (totalPane.getLayout()));
    cl.show(totalPane, "searchList");
    searchInList(search, totalModel, totalSearchModel, listToCheck);
}