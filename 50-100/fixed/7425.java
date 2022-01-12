public static void showAlert(android.app.Activity activity, java.lang.String title, java.lang.String msg) {
    com.extenprise.mapp.util.Utility.showAlert(activity, title, msg, false, null, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    });
}