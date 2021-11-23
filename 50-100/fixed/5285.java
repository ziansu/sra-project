@android.annotation.SuppressLint(value = "RtlHardcoded")
public void run() {
    android.widget.Toast toast = android.widget.Toast.makeText(this, (((("Image of " + (mFirstname)) + " ") + (mLastname)) + " captured"), Toast.LENGTH_SHORT);
    toast.setGravity(((android.view.Gravity.BOTTOM) | (android.view.Gravity.RIGHT)), 0, 0);
    toast.show();
}