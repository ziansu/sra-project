private void showToast(final java.lang.String text) {
    if (showToastOnRespone) {
        ((android.app.Activity) (context)).runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                if ((text != null) && ((text.length()) > 0))
                    android.widget.Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                
            }
        });
    }
}