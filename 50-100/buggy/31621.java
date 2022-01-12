public void onClick(android.view.View v) {
    android.widget.TextView Total = ((android.widget.TextView) (findViewById(R.id.totalView)));
    java.lang.CharSequence prevText = Total.getText();
    if ((calcPressed[0]) == true) {
        prevText = "";
        calcPressed[0] = false;
    }
    decimal[0] = true;
    Total.setText((prevText + "."));
    return ;
}