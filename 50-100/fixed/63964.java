private void fillEmailTable() {
    receiveEmail((-1));
    java.util.ArrayList<java.lang.String> emailList = getTableContent();
    for (int i = 0; i < (emailList.size()); i = i + 3) {
        tableModelInbox.addRow(emailList.subList(i, (i + 3)).toArray());
    }
    tableMain.addRowSelectionInterval(0, 0);
}