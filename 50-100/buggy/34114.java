@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    java.lang.System.out.println("ViewController started");
    com.gridworld.grid.FiftyGrids list = com.gridworld.app.Main.gridList;
    java.lang.System.out.println(list);
    java.lang.System.out.println("got gridlist");
    java.util.ArrayList<com.gridworld.grid.Grid> grids = list.gridsList;
    java.lang.System.out.println("got internal list of grids");
    java.lang.System.out.println(grids);
    javafx.collections.ObservableList<com.gridworld.grid.Grid> oblist = javafx.collections.FXCollections.observableArrayList(grids);
    mapList.setItems(oblist);
    java.lang.System.out.println("made listview with grids");
    java.lang.System.out.println("ListView should be working");
    displayButton.setOnAction(this::handleButtonAction);
}