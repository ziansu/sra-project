private void init() {
    responseData = null;
    responseData2 = null;
    nameEdit = ((android.widget.EditText) (findViewById(R.id.nameEdit)));
    pinEdit = ((android.widget.EditText) (findViewById(R.id.pinEdit)));
    loginButton = ((android.widget.Button) (findViewById(R.id.loginButton)));
    loginButton.setOnClickListener(this);
    progressBar = ((android.widget.ProgressBar) (findViewById(R.id.progress_bar)));
    progressBar.setVisibility(View.GONE);
}