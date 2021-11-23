public void run() {
    am.updateList();
    tabs.getTabs().add(addTab);
    notifyPreloader(new javafx.application.Preloader.StateChangeNotification(javafx.application.Preloader.StateChangeNotification.Type.BEFORE_START));
    primaryStage.show();
}