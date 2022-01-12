private javafx.scene.layout.HBox createMenuBarsInHbox() {
    javafx.scene.layout.HBox hBox = new javafx.scene.layout.HBox();
    javafx.scene.control.Menu fileMenu = new javafx.scene.control.Menu("File");
    openMenu = new javafx.scene.control.MenuItem("Open");
    fileMenu.getItems().addAll(openMenu);
    javafx.scene.control.Menu edit = new javafx.scene.control.Menu("Edit");
    javafx.scene.control.Menu view = new javafx.scene.control.Menu("View");
    javafx.scene.control.MenuBar menuBar = new javafx.scene.control.MenuBar();
    menuBar.getMenus().addAll(fileMenu, edit, view);
    hBox.getChildren().addAll(menuBar);
    return hBox;
}