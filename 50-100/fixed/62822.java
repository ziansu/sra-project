@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((getFragmentManager().getBackStackEntryCount()) == 0) {
        outState.putBoolean(Constants.STATE_RESOLVING_ERROR, mResolvingError);
        outState.putString(Constants.DESTINATION, mButtonSetDestination.getText().toString());
    }
}