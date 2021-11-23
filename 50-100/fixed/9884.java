private void initView() {
    mobileNumber = getIntent().getStringExtra("NUMBER");
    android.widget.TextView mobileNum = getView(R.id.editText_mobileNumber);
    profilePic = getView(R.id.profile_thumb);
    mobileNum.setText(((getResources().getString(R.string.string_plus)) + (mobileNumber)));
    emailEditText = getView(R.id.editText_email);
    nameEditText = getView(R.id.editText_name);
}