@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    paperSize.getItems().addAll(javafx.print.Paper.A6, javafx.print.Paper.A4);
    paperSize.getSelectionModel().selectFirst();
}