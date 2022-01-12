private void showLoading() {
    if ((context) instanceof android.app.Activity) {
        ((android.app.Activity) (context)).runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                pDialog = new android.app.ProgressDialog(context);
                pDialog.setMessage(loadingText);
                pDialog.show();
            }
        });
    }
}