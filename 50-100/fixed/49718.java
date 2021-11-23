private void initUI() {
    nicknameView = ((android.widget.EditText) (findViewById(R.id.sign_up_nickname)));
    passwordView = ((android.widget.EditText) (findViewById(R.id.sign_up_password)));
    passwordConfirmView = ((android.widget.EditText) (findViewById(R.id.sign_up_password_confirm)));
    loadingLayout = ((android.widget.FrameLayout) (findViewById(R.id.sign_up_loading_layout)));
    if ((loadingLayout) != null) {
        loadingLayout.setVisibility(View.GONE);
    }
}