@android.annotation.SuppressLint(value = "InflateParams")
@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    final android.support.v7.app.AlertDialog.Builder dialogBuilder = new android.support.v7.app.AlertDialog.Builder(getActivity());
    final android.view.LayoutInflater inflater = android.view.LayoutInflater.from(getActivity());
    final android.view.View contentView = inflater.inflate(R.layout.dialog_install_warning, null);
    setRank(contentView);
    setTextBadges(contentView);
    setProceedButton(contentView);
    setTrustedAppButton(contentView);
    dialogBuilder.setView(contentView);
    final android.support.v7.app.AlertDialog dialog = dialogBuilder.create();
    dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    return dialog;
}