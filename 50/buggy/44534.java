@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    try {
        gotoReport(event);
        gotoMain(event);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}