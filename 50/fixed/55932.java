@java.lang.Override
public void OnCartItemsLoaded() {
    itemsList = mCart.cartProducts;
    adapter.itemsList = itemsList;
    adapter.notifyDataSetChanged();
}