@java.lang.Override
protected void onResume() {
    super.onResume();
    this.mAuthTask = null;
    if (mCheckBox.isChecked())
        mPasswordField.setVisibility(View.VISIBLE);
    
}