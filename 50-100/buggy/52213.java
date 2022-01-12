private app.model.Checkout buildCheckoutModel(javax.servlet.http.HttpServletRequest request) {
    app.model.Checkout checkoutModel = new app.model.Checkout();
    java.util.List<app.model.ShoopingCart> checkoutProducts = ((java.util.List<app.model.ShoopingCart>) (request.getSession().getAttribute("session_products")));
    checkoutModel.setCheckoutProducts(checkoutProducts);
    checkoutModel.setProductsQuantity(checkoutProducts.size());
    checkoutModel.setTotal(getTotal(checkoutProducts));
    return checkoutModel;
}