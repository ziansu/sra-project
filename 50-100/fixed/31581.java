protected void drawSideBar() {
    super.drawSideBar();
    final javafx.scene.control.TextField searchBar = new javafx.scene.control.TextField();
    searchBar.setOnKeyReleased(( event) -> {
    });
    com.playonlinux.ui.impl.javafx.mainwindow.engines.LeftButton wine = new com.playonlinux.ui.impl.javafx.mainwindow.engines.LeftButton("/com/playonlinux/ui/impl/javafx/mainwindow/engines/wine.png", "Wine");
    com.playonlinux.ui.impl.javafx.mainwindow.engines.LeftSpacer spacer = new com.playonlinux.ui.impl.javafx.mainwindow.engines.LeftSpacer();
    addToSideBar(searchBar, spacer, new com.playonlinux.ui.impl.javafx.mainwindow.engines.LeftBarTitle("Engines"), wine);
}