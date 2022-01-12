@java.lang.Override
protected void onStart() {
    super.onStart();
    android.os.Bundle b = new android.os.Bundle();
    b.putBoolean(Constants.ADD_NOTE_DIRECTLY_FROM_CALL, false);
    if (((getIntent()) != null) && (getIntent().getBooleanExtra(Constants.ADD_NOTE_DIRECTLY_FROM_CALL, false))) {
        b.putBoolean(Constants.ADD_NOTE_DIRECTLY_FROM_CALL, true);
        switchFragment(new com.rohan.callnote.fragments.LoginFragment(), false, b, com.rohan.callnote.fragments.LoginFragment.class.getSimpleName());
    }
}