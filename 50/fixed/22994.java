@java.lang.Override
protected void onSaveInstanceState(final android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBoolean(com.egonzalez.simpleredditclient.view.MainActivity.SAVEDINSTANCESTATE_REQUESTDATA, mMustRequestData);
}