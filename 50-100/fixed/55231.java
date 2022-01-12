private void displayInTable(com.magikbyte.smalldoode.meeting.model.Agent u, java.util.List<java.lang.String> dateUser) {
    int line = (u.getId()) - 1;
    jTable1.setValueAt(u.getName(), line, 0);
    for (int i = 0; i < (dateUser.size()); i++) {
        jTable1.setValueAt(dateUser.get(i), line, (i + 1));
    }
}