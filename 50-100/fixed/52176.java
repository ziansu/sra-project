private void placeSubredditCurrent() {
    if ((mSpinnerIdx) > (-1)) {
        spinner.setSelection(mSpinnerIdx);
        android.util.Log.w(com.is.was.be.wannareddit.MainActivity.TAG, ("First condition:  index issue in Spinner at " + (mSpinnerIdx)));
    }else {
        android.util.Log.w(com.is.was.be.wannareddit.MainActivity.TAG, ("Error: index issue in Spinner at " + (mSpinnerIdx)));
        spinner.setSelection(1);
    }
}