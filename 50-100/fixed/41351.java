public void showOnDisplay(java.lang.String number, java.lang.String operation) {
    setContentView(R.layout.activity_fullscreen);
    android.widget.TextView digitalScreen = ((android.widget.TextView) (findViewById(R.id.textView)));
    android.widget.TextView operationScreen = ((android.widget.TextView) (findViewById(R.id.textView1)));
    digitalScreen.setText(number);
    operationScreen.setText(operation);
}