@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((mPairsSpinner) != null) {
        outState.putInt("position", mPairsSpinner.getSelectedItemPosition());
    }
}