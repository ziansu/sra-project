public static void showLoading(java.lang.String str) {
    if ((com.example.wwang.movie.utils.Common.dialogLoading) != null)
        return ;
    
    if ((com.example.wwang.movie.utils.Common.context) == null)
        return ;
    
    com.example.wwang.movie.utils.Common.dialogLoading = new android.app.ProgressDialog(com.example.wwang.movie.utils.Common.context);
    com.example.wwang.movie.utils.Common.dialogLoading.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    com.example.wwang.movie.utils.Common.dialogLoading.setMessage(str);
    com.example.wwang.movie.utils.Common.dialogLoading.setIndeterminate(false);
    com.example.wwang.movie.utils.Common.dialogLoading.setCancelable(true);
    com.example.wwang.movie.utils.Common.dialogLoading.setOnDismissListener(com.example.wwang.movie.utils.Common.listenerDismissLoading);
    com.example.wwang.movie.utils.Common.dialogLoading.show();
}