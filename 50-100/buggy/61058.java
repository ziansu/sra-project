@javafx.fxml.FXML
public void initialize() {
    sample.ClientThread cliente = new sample.ClientThread("italo", 2000, 2000);
    sample.ClientThread cliente2 = new sample.ClientThread("yuri", 500, 500);
    myButton.setOnAction((javafx.event.ActionEvent event) -> {
        cliente.run(animation);
    });
    test.setOnAction((javafx.event.ActionEvent event) -> {
        cliente2.run(animation);
    });
}