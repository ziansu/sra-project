public void DisplayMessage(java.lang.String Message, java.lang.String Sender) {
    android.widget.LinearLayout MessageWindow = ((android.widget.LinearLayout) (findViewById(R.id.ScrollLayout)));
    android.widget.TextView MessageBox = new android.widget.TextView(this);
    MessageBox.setText(((Sender + ": ") + Message));
    MessageBox.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
    MessageWindow.addView(MessageBox);
}