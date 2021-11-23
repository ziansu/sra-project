@java.lang.Override
protected void onResume() {
    super.onResume();
    totalPrice = +(totalPrice);
    tvTotalPrice.setText(("Total Price: " + (totalPrice)));
}