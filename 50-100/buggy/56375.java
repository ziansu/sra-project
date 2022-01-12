private void messageUser(@android.support.annotation.NonNull
java.lang.String msg) {
    if (msg == null) {
        throw new java.lang.NullPointerException("Message to user cannot be null.");
    }
    android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), msg, ((msg.length()) > 24 ? android.widget.Toast.LENGTH_LONG : android.widget.Toast.LENGTH_SHORT));
    toast.setGravity(((android.view.Gravity.TOP) | (android.view.Gravity.CENTER_HORIZONTAL)), 0, 0);
    toast.show();
}