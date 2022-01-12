@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    EventWindow.LoadEventWindow eventWindow = new EventWindow.LoadEventWindow();
    MapHTML.LoadMap map = new MapHTML.LoadMap();
    LogWindow.LoadLogWindow logWindow = new LogWindow.LoadLogWindow();
    UnitTableView.LoadUnitTable unitTable = new UnitTableView.LoadUnitTable();
    PendingTableView.LoadPendingTable pendingTable = new PendingTableView.LoadPendingTable();
    logWindow.start(MainWindow);
    map.start(MainWindow);
    eventWindow.start(MainWindow);
    pendingTable.start(MainWindow);
    MainWindow.close();
}