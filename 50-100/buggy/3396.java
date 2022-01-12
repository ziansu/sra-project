public void onClick(android.view.View arg0) {
    android.widget.TextView volNum = ((android.widget.TextView) (findViewById(R.id.input_vol_num)));
    volNum.setText(java.lang.Integer.toString(((java.lang.Integer.parseInt(volNum.getText().toString())) + 1)));
}