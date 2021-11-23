@java.lang.Override
protected android.app.Dialog onCreateDialog(final int id) {
    super.onCreateDialog(id);
    final android.app.Dialog dialog = new android.app.Dialog(this);
    dialog.setContentView(R.layout.about);
    dialog.setTitle(getString(R.string.about));
    java.lang.String version = BuildConfig.VERSION_NAME;
    ((android.widget.TextView) (dialog.findViewById(R.id.txtVersion))).setText(getText(R.string.version).toString().replace("$version", version));
    return dialog;
}