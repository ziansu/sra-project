@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    caldroidFragment.saveStatesToKey(outState, "CALDROID_SAVED_STATE");
}