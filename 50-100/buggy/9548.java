@java.lang.Override
public void run() {
    try {
        processCallApiDeleteRace(data.toString());
        com.runningracehisotry.utilities.LogUtil.d(Constants.LOG_TAG, ("List race: " + (data.toString())));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (mLoadingDialog.isShowing()) {
                mLoadingDialog.dismiss();
            }
        } catch (java.lang.Exception ex) {
        }
    }
}