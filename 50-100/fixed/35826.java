public void onClick(android.view.View v) {
    int difference = quantityReceived();
    qty = helper.increaseQty(qty, difference, name);
    android.widget.TextView itemQty = ((android.widget.TextView) (findViewById(R.id.product_qty)));
    itemQty.setText(("Quantity: " + (java.lang.String.valueOf(qty))));
}