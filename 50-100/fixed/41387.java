@javafx.fxml.FXML
void sendMessage(javafx.event.ActionEvent event) {
    java.lang.String message = this.messageView.getText();
    if (message != null) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm:ss");
        listView.getItems().add((((sdf.format(cal.getTime())) + ": ") + message));
    }
}