@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    categoryNameField.textProperty().bindBidirectional(categoryNameModel.categoryName);
    okButton.disableProperty().bind(javafx.beans.binding.Bindings.isEmpty(categoryNameField.textProperty()));
}