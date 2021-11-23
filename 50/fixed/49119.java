@java.lang.Override
public void onFailure(com.chalmers.tda367.localfeud.data.handler.DataResponseError error, java.lang.String errormessage) {
    imageButton.setImageResource(originalLikeDrawable);
    showSnackbar(getString(R.string.like_error_msg));
    imageButton.setEnabled(true);
}