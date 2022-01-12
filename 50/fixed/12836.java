@java.lang.Override
public void onClick(android.view.View v) {
    (newQty)--;
    if ((newQty) < 1) {
        newQty = 1;
    }
    qtyEditText.setText(java.lang.Integer.toString(newQty));
}