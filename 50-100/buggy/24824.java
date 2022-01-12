private void initControllers(main.java.flash.Main main) {
    allTableControl = new main.java.gui.TasksTableController();
    floatingTableControl = new main.java.gui.TasksTableController();
    overdueTableControl = new main.java.gui.TasksTableController();
    pendingTableControl = new main.java.gui.TasksTableController();
    completeTableControl = new main.java.gui.TasksTableController();
    barControl = new main.java.gui.CommandBarController(this);
    tabControl = new main.java.gui.TabsController();
    allDisplay = pendingTableControl.getListView();
    floatingDisplay = pendingTableControl.getListView();
    overdueDisplay = pendingTableControl.getListView();
    pendingDisplay = pendingTableControl.getListView();
    completeDisplay = completeTableControl.getListView();
}