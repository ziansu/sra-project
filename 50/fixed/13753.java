@javafx.fxml.FXML
private void start_button_handler(javafx.event.ActionEvent event) {
    if (run_Thread) {
    }else {
        tiva.connect();
        run_Thread = true;
        startTask();
    }
}