@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    com.pratilipi.mobile.android.util.Log.v("Hello", ("dismiss - " + (com.pratilipi.mobile.android.appDialogs.apprate.AppRatingDialogs.mRateDialogDismissedOnClickOutside)));
    if (com.pratilipi.mobile.android.appDialogs.apprate.AppRatingDialogs.mRateDialogDismissedOnClickOutside) {
        com.pratilipi.mobile.android.appDialogs.apprate.AppRatingDialogUtil.initiateUserAppSessionCountForRate(appContext);
        com.pratilipi.mobile.android.appDialogs.apprate.AppRatingDialogUtil.addNoClickedCountOnRateDialog(appContext);
        com.pratilipi.mobile.android.appDialogs.apprate.AppRatingDialogUtil.saveRatingDialogNoClickedTime(appContext);
        com.pratilipi.mobile.android.appDialogs.apprate.AppRatingDialogs.sendRatePlaySelectedEvent(appContext, location, StaticConstants.AmplitudeEvents.NO);
        com.pratilipi.mobile.android.appDialogs.apprate.AppRatingDialogs.sendRatePlayStoreCleverTapEvent(appContext, pratilipi, cleverTapLocation, CleverTapConstants.NO);
    }
}