@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    gui = new seedu.addressbook.ui.Gui(new seedu.addressbook.logic.Logic(), seedu.addressbook.Main.VERSION);
    gui.start(primaryStage, this);
}