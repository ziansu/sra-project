@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putBoolean(Constants.KEY_BUNDLE_FIRST_LOAD_DONE, true);
    super.onSaveInstanceState(outState);
}