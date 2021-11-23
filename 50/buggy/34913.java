@java.lang.Override
public void onToSignInListener(java.lang.String id) {
    onBackPressed();
    mSignInFrag.setEditInit(id);
    setBarTitle(R.string.sign_in_title);
}