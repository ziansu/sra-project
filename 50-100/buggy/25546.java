private void verifyReadStatusOfIssuesBelow(int index, boolean isExpectedStatusRead) {
    for (int i = index; i >= 1; i--) {
        ui.listpanel.ListPanelCell listPanelCell = getIssueCell(0, index);
        org.junit.Assert.assertEquals(listPanelCell.getIssue().isCurrentlyRead(), isExpectedStatusRead);
    }
}