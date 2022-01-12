public void toCheckoutActionPerformed(javafx.event.ActionEvent evt) {
    if ((evt.getSource().equals(checkoutButton)) && (!((content) instanceof imat.viewcontroller.CheckOutViewController))) {
        imat.viewcontroller.CheckOutViewController checkOutViewController = imat.viewcontroller.CheckOutViewController.load("CheckOutView.fxml");
        setContent(checkOutViewController);
        checkOutViewController.showCart();
    }
}