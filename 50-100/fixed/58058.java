@java.lang.Override
public void start(javafx.stage.Stage primaryStage) {
    br.ufrn.imd.io.ReaderObject ro = br.ufrn.imd.io.ReaderObject.getInstance();
    ro.readFiles();
    br.ufrn.imd.main.Main.primaryStage = primaryStage;
    br.ufrn.imd.main.Main.primaryStage.setTitle("Java Music Player");
    br.ufrn.imd.main.Main.primaryStage.setResizable(false);
    br.ufrn.imd.main.Main.primaryStage.resizableProperty().setValue(false);
    initRootLayout();
    br.ufrn.imd.navigation.Navigation.goTo("LoginView");
}