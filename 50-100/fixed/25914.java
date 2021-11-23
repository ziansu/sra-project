private void messageUser(java.lang.String msg) {
    android.widget.Toast toast = android.widget.Toast.makeText(this, msg, ((msg.length()) > 24 ? android.widget.Toast.LENGTH_LONG : android.widget.Toast.LENGTH_SHORT));
    toast.setGravity(((android.view.Gravity.TOP) | (android.view.Gravity.CENTER_HORIZONTAL)), 0, 0);
    toast.show();
}