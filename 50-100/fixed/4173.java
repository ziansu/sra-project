@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception e) {
    progress.dismiss();
    com.satra.traveler.utils.Tutility.showMessage(this, getString(R.string.signinerror, e.getMessage()), getString(R.string.app_name));
    android.util.Log.e("signinerror", ("error: " + (e.getMessage())));
}