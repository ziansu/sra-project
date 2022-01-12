public void changed(javafx.beans.value.ObservableValue ov, java.lang.Number value, java.lang.Number new_value) {
    if ((com.jbd.controller.PaymentController.facturaAPagar.getItems().size()) > 0) {
        com.jbd.controller.PaymentController.RestBillN = ((java.lang.String) (com.jbd.controller.PaymentController.facturaAPagar.getItems().get(((java.lang.Integer) (new_value)))));
        fillTotalLabels();
    }
}