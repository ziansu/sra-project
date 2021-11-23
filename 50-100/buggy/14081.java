@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    if (mResolvingError) {
        return ;
    }
    if (!(connectionResult.hasResolution())) {
        try {
            connectionResult.startResolutionForResult(this, strayanslangapp.noni.com.strayanslangapp.presentation.activities.HangmanActivity.REQUEST_RESOLVE_ERROR);
            mResolvingError = true;
        } catch (android.content.IntentSender exception) {
            mGoogleApiClient.connect();
            mResolvingError = false;
        }
    }else {
        mPresenter.handleNonResoluteError(connectionResult.getErrorCode());
    }
}