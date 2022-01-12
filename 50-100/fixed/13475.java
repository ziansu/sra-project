public void onClick(android.view.View v) {
    android.view.View view = getWindow().getDecorView().findViewById(android.R.id.content);
    if (null != view) {
        android.widget.TextView textView = ((android.widget.TextView) (view.findViewById(R.id.edit_text_out)));
        java.lang.String message = textView.getText().toString();
        sendMessage(message);
    }
}