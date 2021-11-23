public void changePickAtStoreAndReloadShipping() {
    com.magestore.app.lib.model.checkout.Checkout checkout = ((com.magestore.app.lib.model.checkout.Checkout) (wraper.get("save_cart")));
    if (checkout != null) {
        java.util.List<com.magestore.app.lib.model.checkout.CheckoutShipping> listShipping = checkout.getCheckoutShipping();
        if ((listShipping != null) && ((listShipping.size()) > 0)) {
            bindDataToShippingMethodList(listShipping);
            autoSelectShipping(listShipping);
        }
    }
}