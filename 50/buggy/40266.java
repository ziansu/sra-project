@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    java.lang.System.out.println("Test");
    cartConfirmationController.injectCheckoutController(this);
}