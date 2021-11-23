@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    resetShoppingCartButton.setDisable(true);
    resetShoppingCart();
    if (imat.getCenterController().getListVyPane().getChildren().contains(imat.getCenterController().lv)) {
        imat.getCenterController().changeToCheckoutView();
    }
    shoppingCartListView.getPlaceholder().setVisible(true);
    changeCartLink.setDisable(true);
}