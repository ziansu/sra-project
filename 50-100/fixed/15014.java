@play.mvc.Security.Authenticated(value = util.auth.Secured.class)
public play.mvc.Result view() {
    cartItems = ((java.util.List<java.util.List<java.lang.String>>) (play.cache.Cache.get("cartdata")));
    if ((cartItems) == null) {
        cartItems = new java.util.ArrayList<java.util.List<java.lang.String>>();
    }
    return ok(views.html.viewcart.render(cartItems.size(), cartItems));
}