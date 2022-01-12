public void submitOrder(android.view.View view) {
    int price = calculatePrice(quantity);
    android.widget.CheckBox addCreamCheckBox = ((android.widget.CheckBox) (findViewById(R.id.creamCbox_id)));
    boolean hasCream = addCreamCheckBox.isChecked();
    android.widget.CheckBox addMMCheckBox = ((android.widget.CheckBox) (findViewById(R.id.mmCBox_id)));
    creatOrderSummary(price, hasCream);
}