@java.lang.Override
public void onFailed(com.ctnet.mobifone8.api.core.ApiError apiError) {
    dismissProgressDialog();
    showMessage(apiError.getMessage());
    mCurrentAvatarUri = null;
}