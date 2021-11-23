@javafx.fxml.FXML
private void start_button_handler(javafx.event.ActionEvent event) {
    if (run_Thread) {
        java.lang.System.out.println("Thread already running");
    }else {
        java.lang.System.out.println("Start!");
        tiva.connect();
        run_Thread = true;
        startTask();
    }
}