@javafx.fxml.FXML
public void initialize() {
    sample.ClientThread cliente = new sample.ClientThread("italo", 2000, 2000, animation);
    sample.ClientThread cliente2 = new sample.ClientThread("yuri", 500, 500, animation);
    myButton.setOnAction((javafx.event.ActionEvent event) -> {
        cliente.start();
    });
    test.setOnAction((javafx.event.ActionEvent event) -> {
        cliente2.start();
    });
}