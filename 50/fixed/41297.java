@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelableArrayList(it.kdevgroup.incaneva.HomeActivity.BUNDLE_KEY_FOR_ARRAY, blogEventList);
    outState.putInt(it.kdevgroup.incaneva.HomeActivity.BUNDLE_KEY_CURRENTSECTION, currentCategory);
    android.util.Log.i(it.kdevgroup.incaneva.HomeActivity.TAG, "onSaveInstanceState: salvo elementi nel bundle");
}