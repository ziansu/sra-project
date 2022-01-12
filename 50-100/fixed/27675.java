@java.lang.Override
protected void onPostExecute(java.lang.Boolean bResult) {
    progressDL.dismiss();
    if (!bResult) {
        android.widget.Toast.makeText(this, "Slow or unstable internet connection. Please try again.", Toast.LENGTH_LONG).show();
        return ;
    }
    if (hasUpdate) {
        General.mainAutoUpdate.StartAutoUpdate();
        android.widget.Toast.makeText(this, "An update has been released, please update system.", Toast.LENGTH_LONG).show();
    }else {
        android.widget.Toast.makeText(this, "No new updates available.", Toast.LENGTH_SHORT).show();
    }
}