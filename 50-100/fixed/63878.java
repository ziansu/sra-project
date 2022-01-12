private void setupLayout(javafx.scene.layout.GridPane root) {
    javafx.scene.control.Menu moduleMenu = setupModuleMenu();
    javafx.scene.control.Menu fileMenu = setupFileMenu();
    javafx.scene.control.MenuBar menuBar = new javafx.scene.control.MenuBar();
    menuBar.getMenus().addAll(moduleMenu, fileMenu);
    menuBar.setMinWidth(1400);
    root.add(menuBar, 0, 0);
    root.add(Window.tabPane, 0, 1);
    addModuleTab("Test");
}