@java.lang.Override
public void checkNotificationAvailableOrNotInServerStart() {
    java.lang.String token = humane.vuram.com.humane.util.Connectivity.getAuthToken(homePageViewInterface.getContext());
    if ((userProfile.getRole()) == (humane.vuram.com.humane.util.CommonKeyValues.REGISTERED_USER)) {
        if (!(humane.vuram.com.humane.util.Connectivity.isNetworkAvailable(homePageViewInterface.getContext()))) {
            homePageViewInterface.showInternetNotAvailableMsg(homePageViewInterface.getContext().getString(R.string.internet_connection), new humane.vuram.com.humane.home.model.CheckNotificationAvailability(token, this));
        }else {
            homePageViewInterface.hideInternetNotAvailableMsg();
            new humane.vuram.com.humane.home.model.CheckNotificationAvailability(token, this).execute();
        }
    }
}