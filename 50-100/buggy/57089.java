@butterknife.OnTextChanged(value = R.id.offset_y_et)
void onOffsetYChanged(java.lang.CharSequence text) {
    try {
        mFaceOverlayView.setOffsetY(java.lang.Long.parseLong(text.toString()));
        android.util.Log.d("MainActivity", ("offsetY: " + (text.toString())));
    } catch (java.lang.NumberFormatException e) {
        android.widget.Toast.makeText(this, "Please, write only numbers :\\", Toast.LENGTH_SHORT).show();
    }
}