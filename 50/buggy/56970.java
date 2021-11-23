@javafx.fxml.FXML
private void loadMyApps() {
    java.lang.System.out.println("Came here1");
    javafx.collections.ObservableList<Main_Project.MyAppEntry> populateTable = getPopTable();
    myAppList.setItems(populateTable);
}