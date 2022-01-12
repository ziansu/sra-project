public void loginGoogle(android.view.View view) {
    showActivityIndicator();
    if (!(com.isawabird.Utils.isNetworkAvailable(getApplicationContext()))) {
        android.widget.Toast.makeText(getApplicationContext(), "Network not available", Toast.LENGTH_SHORT).show();
        hideActivityIndicator();
    }
}