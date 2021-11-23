@java.lang.Override
public void onClick(android.view.View v) {
    productListener.removeThisProduct(getItem(position).getProductId());
}