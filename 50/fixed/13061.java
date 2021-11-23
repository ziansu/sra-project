@dagger.Provides
android.app.ProgressDialog provideMainPresenter(android.content.Context context) {
    android.app.ProgressDialog dialog = new android.app.ProgressDialog(context, android.app.ProgressDialog.STYLE_SPINNER);
    dialog.setCancelable(false);
    dialog.setCanceledOnTouchOutside(false);
    return dialog;
}