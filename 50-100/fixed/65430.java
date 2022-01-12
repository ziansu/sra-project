public static controllers.Result orderFail() {
    java.lang.String email = session().get("email");
    controllers.User user = controllers.User.find(email);
    int userid = user.id;
    controllers.Cart cart = controllers.Cart.getCart(email);
    controllers.Cart.clear(userid);
    flash("failBuy", "Transaction canceled!");
    return ok(orderresult.render());
}