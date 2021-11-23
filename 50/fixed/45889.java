@javafx.fxml.FXML
public void onLogin(javafx.event.ActionEvent event) {
    java.lang.String sendMessage = "Login Controller estou aqui.\n";
    client.send(sendMessage);
}