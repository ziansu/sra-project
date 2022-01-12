@java.lang.Override
protected void onPostExecute(com.fourreau.itwapp.model.AsyncTaskResult<io.itwapp.models.Interview> result) {
    if ((result.getError()) != null) {
        showAlertDialog(R.string.dialog_title_generic_error, R.string.dialog_content_generic_error_server);
    }else
        if (isCancelled()) {
            showAlertDialog(R.string.dialog_title_generic_error, R.string.dialog_content_cancellation);
        }else {
            io.itwapp.models.Interview interview = result.getResult();
            if (interview != null) {
                delegate.processFinishUpdate(interview);
            }
        }
    
    mProgressDialog.dismiss();
}