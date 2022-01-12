@javafx.fxml.FXML
void handleButtonAction(javafx.event.ActionEvent event) {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    java.io.File file = fileChooser.showOpenDialog(new javafx.stage.Stage());
    lineChart.setTitle("Profit Chart");
    lineChart.setVisible(true);
    lineChart.getData().add(com.deskind.mnemocardsfx.util.CsvUtil.getCsv(file.getPath(), java.lang.Double.parseDouble(depositField.getText()), java.lang.Double.parseDouble(betField.getText()), java.lang.Double.parseDouble(brokerInterest.getText())));
}