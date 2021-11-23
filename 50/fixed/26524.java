@java.lang.Override
protected void onResume() {
    super.onResume();
    mSharedPreferences = getSharedPreferences(Const.MY_PREFERENCE, Context.MODE_PRIVATE);
    mEditTextEmail.setText(mSharedPreferences.getString(Const.EMAIL, ""));
}