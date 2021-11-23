@java.lang.Override
protected void onPause() {
    if ((levelCompletePopup) != null) {
        levelCompletePopup.dismiss();
        (levelnum)++;
    }
    levelCompletePopup = null;
    saveState();
    try {
        if ((actwriter) != null)
            actwriter.close();
        
        actwriter = null;
    } catch (java.io.IOException e) {
        android.util.Log.e("Primary", "Error closing activity file.", e);
    }
    super.onPause();
}