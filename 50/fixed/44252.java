@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    this.primaryStage = primaryStage;
    scenes.KatalogCreator.chooseTask(primaryStage);
    primaryStage.setTitle("Wähle einen Katalog aus");
    primaryStage.show();
}