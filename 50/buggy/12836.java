@java.lang.Override
public void onClick(android.view.View v) {
    (newQty)--;
    if ((newQty) < 0) {
        newQty = 0;
    }
    qtyEditText.setText(java.lang.Integer.toString(newQty));
}