@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    primaryStage.getIcons().add(new javafx.scene.image.Image("file:doc/images/AddressApp_Logo.png"));
    gui = new seedu.addressbook.ui.Gui(new seedu.addressbook.logic.Logic(), seedu.addressbook.Main.VERSION);
    gui.start(primaryStage, this);
}