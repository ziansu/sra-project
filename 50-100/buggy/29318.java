@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
    this.setCancelable(false);
    builder.setCancelable(false).setPositiveButton(R.string.save, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            savePokemon(true);
        }
    }).setNegativeButton(R.string.cancel, null).setView(fillView(android.view.LayoutInflater.from(getActivity()), null));
    return builder.create();
}