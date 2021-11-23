@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onPostExecute(com.ichi2.async.DeckTask.TaskData result) {
    if (result == null) {
        return ;
    }
    if ((mFragmented) && (removingCurrent)) {
        updateDeckList();
        openStudyOptions(false);
    }else {
        updateDeckList();
    }
    if (mProgressDialog.isShowing()) {
        try {
            mProgressDialog.dismiss();
        } catch (java.lang.Exception e) {
            timber.log.Timber.e(e, "onPostExecute - Exception dismissing dialog");
        }
    }
}