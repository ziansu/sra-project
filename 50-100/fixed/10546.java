public void inverseClicked(android.view.View v) {
    android.widget.TextView textView2 = ((android.widget.TextView) (findViewById(R.id.textView2)));
    tempNum = java.lang.Double.parseDouble(textView2.getText().toString());
    tempNum = (tempNum) * (-1);
    textView2.setText(java.lang.String.valueOf(tempNum));
}