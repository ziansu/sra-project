@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    categoryNameField.textProperty().bindBidirectional(categoryNameModel.categoryName);
    okButton.disableProperty().bind(categoryNameField.textProperty().isEmpty());
}