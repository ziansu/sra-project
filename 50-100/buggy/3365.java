public void onClick(android.content.DialogInterface dialog, int id) {
    try {
        org.apache.commons.io.FileUtils.forceDelete(new java.io.File(logLsf.getParent(), "indexMessageList.stackIndex"));
    } catch (java.lang.Exception e) {
        android.util.Log.i(pt.lsts.alvii.MRALite.TAG, "Error while trying to delete mra/ folder", e);
    }
    startIndex(logLsf, true);
    customHandler.postDelayed(updateTimerThread, 2000);
    checkIndex = true;
}