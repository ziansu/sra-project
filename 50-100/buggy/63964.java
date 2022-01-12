private void fillEmailTable() {
    receiveEmail((-1));
    java.util.ArrayList<java.lang.String> emailList = getTableContent();
    java.lang.Integer insertedLine = 0;
    for (int i = 0; i < ((emailList.size()) - 3); i = i + 3) {
        tableModelInbox.addRow(emailList.subList(i, (i + 3)).toArray());
        insertedLine++;
    }
    tableMain.addRowSelectionInterval(0, 0);
}