public static void showProgressDialog(android.content.Context c, android.app.Activity a) {
    android.view.View v = a.getLayoutInflater().inflate(R.layout.custom_progress, null);
    if ((thebat.lib.validutil.ValidUtils.progress) == null) {
        thebat.lib.validutil.ValidUtils.progress = com.kaopiz.kprogresshud.KProgressHUD.create(a).setCustomView(v).setCancellable(true).show();
    }
}