private void logout() {
    client.write(ServerMessages.Logout, null);
    jTabbedPane1.remove(jPanel6);
    jTabbedPane1.add(jPanel2, 1);
    jTabbedPane1.setTitleAt(1, "Online");
    jTabbedPane1.setSelectedIndex(1);
    jButton1.setEnabled(true);
}