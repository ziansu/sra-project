@java.lang.Override
public void onClick(android.view.View view) {
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    (quantity)--;
    quantityTextView.setText(java.lang.Integer.toString(quantity));
}