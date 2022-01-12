@java.lang.Override
protected void failed() {
    super.failed();
    java.lang.System.out.println("failed service");
    Main.stage.show();
    close();
    java.lang.System.out.println("Error, failed to capture screen");
    org.controlsfx.control.Notifications.create().title("Error").text("Failed to capture the Screen!").showError();
    reset();
}