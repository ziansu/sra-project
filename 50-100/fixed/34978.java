@java.lang.Override
protected void onPause() {
    saveState();
    if ((levelCompletePopup) != null) {
        levelCompletePopup.dismiss();
        levelCompletePopup = null;
    }
    try {
        if ((actwriter) != null)
            actwriter.close();
        
        actwriter = null;
    } catch (java.io.IOException e) {
        android.util.Log.e("Primary", "Error closing activity file.", e);
    }
    super.onPause();
}