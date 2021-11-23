private void showVerifyCredentialsButton() {
    android.widget.TextView textView = showTextView(R.id.verify_credentials, (state.getAccount().isValidAndSucceeded() ? R.string.title_preference_verify_credentials : R.string.title_preference_verify_credentials_failed), state.builder.isPersistent());
    if (textView != null) {
        textView.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                clearError();
                updateChangedFields();
                updateScreen();
                verifyCredentials(true);
            }
        });
    }
}