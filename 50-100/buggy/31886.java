@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    try {
        if ((java.lang.Integer.parseInt(edu.byui.shane.marykayinventoryapp.ReorderProductActivity.numberToOrderView.getText().toString())) <= 100) {
            edu.byui.shane.marykayinventoryapp.ReorderProductActivity.numberToOrderView.setText(java.lang.Integer.toString(progress));
        }
    } catch (java.lang.NumberFormatException ex) {
        edu.byui.shane.marykayinventoryapp.ReorderProductActivity.numberToOrderView.setText("0");
    }
}