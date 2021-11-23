@java.lang.Override
public void onChanged() {
    com.example.terz99.digitalmenuv2.MyOrderActivity.totalPrice -= (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmPrice()) * ((double) (com.example.terz99.digitalmenuv2.MyOrderActivity.deletedItem.getmQuantity()));
    setTotalPrice();
}