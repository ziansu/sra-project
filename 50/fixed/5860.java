@java.lang.Override
public void onNewPurchase(com.go.kchin.model.SimplePurchase arg) {
    mProductPresenter.buyMore(product.getId(), arg.getPurchasedItems(), arg.getPurchaseAmount());
}