@butterknife.OnFocusChange(value = R.id.eTPassword)
void onPassFocusChanged(boolean focused) {
    final android.view.View llpass = findViewById(R.id.layoutPassword);
    if (!focused) {
        llpass.setAlpha(0.5F);
    }else {
        llpass.setAlpha(1.0F);
    }
}