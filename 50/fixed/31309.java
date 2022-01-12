@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((passwordList) != null) {
        outState.putStringArray(org.exobel.routerkeygen.ui.NetworkFragment.PASSWORD_LIST, passwordList.toArray(new java.lang.String[passwordList.size()]));
    }
}