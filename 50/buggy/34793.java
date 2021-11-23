public static testpackage.MainController getMainController() {
    java.lang.System.err.println(("FROM REFRESH: Platform.isFxApplicationThread() = " + (javafx.application.Platform.isFxApplicationThread())));
    return testpackage.Refresh.mainController;
}