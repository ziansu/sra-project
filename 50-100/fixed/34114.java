@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    com.gridworld.grid.FiftyGrids list = com.gridworld.app.Main.gridList;
    java.util.ArrayList<com.gridworld.grid.Grid> grids = list.gridsList;
    javafx.collections.ObservableList<com.gridworld.grid.Grid> oblist = javafx.collections.FXCollections.observableArrayList(grids);
    mapList.setItems(oblist);
    displayButton.setOnAction(this::handleButtonAction);
}