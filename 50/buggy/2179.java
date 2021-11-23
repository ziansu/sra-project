@java.lang.Override
public void onNewFloat(float arg) {
    product.productRemaining = arg;
    save();
    reload();
}