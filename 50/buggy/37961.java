@java.lang.Override
public void onError(com.facebook.FacebookException error) {
    showProgressDialog();
    android.widget.Toast.makeText(this, "FaceBook Sign in Failed", Toast.LENGTH_SHORT).show();
    updateUI(null);
}