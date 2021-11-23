public java.lang.String setBasket() {
    if ((currentUser.isLoggedIn()) == false) {
        return "";
    }else {
        basket = orderService.getBasket(currentUser.getCustomer().getId());
        basket.getOrderLines().size();
        lineNumber = 0;
        return "";
    }
}