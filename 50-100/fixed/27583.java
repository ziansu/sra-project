@java.lang.Override
public void getError(java.lang.Integer errorCode) {
    try {
        java.lang.String errorMessage = ir.rasen.myapplication.helper.ServerAnswer.getError(getApplicationContext(), errorCode);
        ir.rasen.myapplication.helper.Dialogs.showMessage(this, errorMessage);
    } catch (java.lang.Exception e) {
        android.util.Log.e(TAG, Params.CLOSED_BEFORE_RESPONSE);
    }
}