private void mainWindowStateChanged(javax.swing.event.ChangeEvent evt) {
    java.lang.System.out.println(("CANVI DE PESTANYA " + (mainWindow.getSelectedIndex())));
    if ((mainWindow.getSelectedIndex()) == 1) {
        updateMPManagementMPTable();
        updateMPManagementAttrDefinitionTable();
    }
    if ((mainWindow.getSelectedIndex()) == 2) {
        updateCommunitiesTable();
        updateMPsInCommunityTable();
    }
    if ((mainWindow.getSelectedIndex()) == 3) {
        compareWindowMPShortTable();
        updateCommunitiesLists();
    }
}