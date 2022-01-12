private boolean isShowADialog() {
    long activityDuration = (mMillsEnd) - (mMillsStart);
    android.util.Log.v(is.fb01.tud.university.mobilesurveystud.BackEnd.Service.MainService.TAG, ("activityDuration: " + activityDuration));
    if (isInactivity()) {
        if (activityDuration > (is.fb01.tud.university.mobilesurveystud.GlobalSettings.gMinUseDuration)) {
            showToast("MS: Please answer survey, bitch!");
            if (mIsScreenOn)
                showSystemAlert();
            else
                showActivity();
            
            return true;
        }
        resetParameter();
    }
    return false;
}