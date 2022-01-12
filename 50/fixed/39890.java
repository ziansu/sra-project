@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putBoolean("hasInitializedFirstFragment", mHasInitializedFirstFragment);
    super.onSaveInstanceState(outState);
}