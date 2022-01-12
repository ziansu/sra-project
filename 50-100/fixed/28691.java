@java.lang.Override
protected void onPostExecute(com.sncf.itif.Services.Plan.Plan plan) {
    if (((dialog) != null) && (dialog.isShowing())) {
        dialog.dismiss();
    }
    try {
        if ((error) != null) {
            callBack.serviceFailure(error);
            return ;
        }
        callBack.serviceSuccess(plan, 1);
    } catch (java.lang.Exception e) {
        error = e;
    }
}