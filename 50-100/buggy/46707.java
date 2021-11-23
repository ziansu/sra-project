private void init() {
    responseData = null;
    responseData2 = null;
    nameEdit = ((android.support.design.widget.TextInputEditText) (findViewById(R.id.nameEdit)));
    pinEdit = ((android.support.design.widget.TextInputEditText) (findViewById(R.id.pinEdit)));
    loginButton = ((com.gc.materialdesign.views.ButtonRectangle) (findViewById(R.id.loginButton)));
    loginButton.setOnClickListener(this);
    progressBar = ((android.widget.ProgressBar) (findViewById(R.id.progress_bar)));
    progressBar.setVisibility(View.GONE);
}