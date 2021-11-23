@java.lang.Override
public void failure(com.appdest.hcue.services.RestError restError) {
    hideLoader();
    android.util.Log.e("Doctor Login", ("" + (restError.getErrorMessage())));
    ivRight.setAlpha(0.25F);
    ivRight.setEnabled(false);
    ivLeft.setAlpha(0.25F);
    ivLeft.setEnabled(false);
}