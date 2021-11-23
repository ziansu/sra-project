@java.lang.Override
public void onShoppingCartUpdated(model.ShoppingCart shoppingCart) {
    this.ui.setShoppingCartContentDisplay(this.getShoppingCart());
}