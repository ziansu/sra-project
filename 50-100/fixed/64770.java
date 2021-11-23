public void run() {
    try {
        com.ms509.ui.menu.DBPopMenu.showtable();
        dblist.expandRow(dblist.getLeadSelectionRow());
        t_locker = 0;
        status.setText("执行完毕");
    } catch (java.lang.Exception e) {
        t_locker = 0;
        status.setText("error");
    }
}