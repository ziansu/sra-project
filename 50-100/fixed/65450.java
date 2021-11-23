@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    this.primaryStage = primaryStage;
    this.primaryStage.setTitle("Michelangelo");
    java.lang.Boolean isFirstStart = prefs.getBoolean("first_start", true);
    if (isFirstStart) {
        java.lang.System.out.println("First Start");
        showFirstStartView();
    }else {
        this.connection = application.DBConnect.getInstance();
        initRootLayout();
        showTableView();
    }
}