public void addFavorite(android.content.Context context, com.app.meenabazaar.meenabazaar.model.Article article) {
    java.util.ArrayList<com.app.meenabazaar.meenabazaar.model.Article> cart_items = getCartItems(context);
    if (cart_items == null) {
        cart_items = new java.util.ArrayList<com.app.meenabazaar.meenabazaar.model.Article>();
    }
    cart_items.add(article);
    saveFavorites(context, cart_items);
}