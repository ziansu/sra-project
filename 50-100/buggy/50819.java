public void incrementQty(android.view.View view) {
    android.widget.TextView quantityTextView = ((android.widget.TextView) (findViewById(R.id.quantity_text_view)));
    int qty = java.lang.Integer.parseInt(quantityTextView.getText().toString().substring(0, quantityTextView.getText().toString().indexOf(" ")));
    qty++;
    quantityTextView.setText((("" + qty) + (com.example.android.justjava.MainActivity.COST_PER_CUP)));
    double subTotal = qty * (com.example.android.justjava.MainActivity.PRICE_PER_CUP);
    display(qty);
}