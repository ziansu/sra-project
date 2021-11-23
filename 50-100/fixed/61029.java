@java.lang.Override
protected void onStart() {
    super.onStart();
    android.content.Intent intent = getIntent();
    java.lang.String password = (intent != null) ? intent.getStringExtra("password") : null;
    if (password != null) {
        this.mNewPassword.getEditableText().clear();
        this.mNewPassword.getEditableText().append(password);
    }
}