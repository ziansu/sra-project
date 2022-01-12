public static synchronized void markConversionForGoal(@android.support.annotation.NonNull
java.lang.String goalIdentifier) {
    if (((com.vwo.mobile.VWO.sSharedInstance) != null) && ((com.vwo.mobile.VWO.sSharedInstance.mVWOStartState.getValue()) >= (VWOStartState.STARTED.getValue()))) {
        if (com.vwo.mobile.VWO.sSharedInstance.isEditMode()) {
            com.vwo.mobile.VWO.sSharedInstance.getVwoSocket().triggerGoal(goalIdentifier);
        }else {
            com.vwo.mobile.VWO.sSharedInstance.mVWOData.saveGoal(goalIdentifier);
        }
    }else {
        com.vwo.mobile.utils.VWOLog.e(VWOLog.UPLOAD_LOGS, "SDK not initialized completely", false, false);
    }
}