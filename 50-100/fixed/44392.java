private void autoSelectPaymentMethod(java.util.List<com.magestore.app.lib.model.checkout.CheckoutPayment> listPayment) {
    if ((listPayment != null) && ((listPayment.size()) > 0)) {
        com.magestore.app.lib.model.checkout.CheckoutPayment paymentDefault = null;
        if ((getSelectedItem().getGrandTotal()) == 0) {
        }else {
            paymentDefault = checkListPaymentDefault(listPayment);
        }
        if (paymentDefault != null) {
            onAddPaymentMethod(paymentDefault);
        }else {
            mCheckoutPaymentListPanel.updateTotal(listPayment);
        }
    }
}