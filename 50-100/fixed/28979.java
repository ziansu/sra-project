@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case com.yatrashare.activities.SplashActivity.REQUEST_CHECK_SETTINGS :
            switch (resultCode) {
                case android.app.Activity.RESULT_OK :
                    getCurrentCountry(null);
                    break;
                case android.app.Activity.RESULT_CANCELED :
                    com.yatrashare.utils.Utils.showProgress(false, splashProgress, progressBGView);
                    com.yatrashare.utils.Utils.showToast(this, "Turn on Location to use your current location");
                    getCountries(null, true);
                    break;
            }
            break;
    }
}