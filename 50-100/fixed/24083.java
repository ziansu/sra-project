@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    if (task.isSuccessful()) {
        us.asimgasimzade.android.neatwallpapers.utils.Utils.showToast(this.getApplicationContext(), getString(R.string.reset_password_success_message), Toast.LENGTH_LONG);
    }else {
        us.asimgasimzade.android.neatwallpapers.utils.Utils.showToast(this.getApplicationContext(), getString(R.string.reset_password_fail_message), Toast.LENGTH_LONG);
    }
    if ((progressDialog) != null) {
        progressDialog.dismiss();
    }
}