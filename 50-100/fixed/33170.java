public void refactorFunc(android.content.Context context) {
    android.widget.TextView tv = new android.widget.TextView(context);
    tv.setText("Hello World");
    if (tv.getText().equals("")) {
        tv.setMaxWidth(234);
    }
    tv.setMaxHeight(getDefaultMaxHeight());
}