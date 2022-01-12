@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult result) {
    if ((mSignInProgress) != (org.gdg.frisbee.android.common.GdgActivity.STATE_IN_PROGRESS)) {
        if (isFatalPlayServiceError(result.getErrorCode())) {
            if (org.gdg.frisbee.android.utils.PrefUtils.shouldShowFatalPlayServiceMessage(this)) {
                showFatalPlayServiceMessage(result);
            }
            return ;
        }
        mSignInIntent = result.getResolution();
        if ((mSignInIntent) != null) {
            resolveSignInError();
        }else {
            if (org.gdg.frisbee.android.utils.PrefUtils.shouldShowFatalPlayServiceMessage(this)) {
                showFatalPlayServiceMessage(result);
            }
        }
    }
}