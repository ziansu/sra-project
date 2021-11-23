@javafx.fxml.FXML
public void btn_showLowQuantity_onClick(javafx.event.ActionEvent actionEvent) {
    if (showsAll) {
        showsAll = false;
        updateTable(showsAll);
        btn_showLowQuantity.setText("Show All products");
    }else {
        showsAll = true;
        updateTable(showsAll);
        btn_showLowQuantity.setText("Show only low quantity");
    }
}