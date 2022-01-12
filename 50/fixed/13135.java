@java.lang.Override
public void onFailure(com.chalmers.tda367.localfeud.data.handler.DataResponseError error, java.lang.String errormessage) {
    imageButton.setImageResource(originalLikeDrawable);
    android.support.design.widget.Snackbar.make(recyclerView, getString(R.string.like_error_msg), Snackbar.LENGTH_LONG).show();
    imageButton.setEnabled(true);
}