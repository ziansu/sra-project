private void setEditTextInPosition(android.widget.EditText editText, int row, int column) {
    android.widget.GridLayout.LayoutParams param = new android.widget.GridLayout.LayoutParams();
    param.setGravity(Gravity.CENTER);
    param.rowSpec = android.widget.GridLayout.spec(row);
    param.columnSpec = android.widget.GridLayout.spec(column);
    editText.setLayoutParams(param);
}