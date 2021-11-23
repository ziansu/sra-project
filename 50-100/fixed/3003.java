public static void Logout(final android.content.Context context) {
    new android.app.AlertDialog.Builder(context).setTitle("Съобщение?").setMessage("Сигурни ли сте, че искате да излезете от профила си?").setPositiveButton(android.R.string.yes, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
            context.startActivity(new android.content.Intent(context, com.inst.mobileinstitutions.HomeActivity.class));
        }
    }).setNegativeButton(android.R.string.no, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    }).setIcon(android.R.drawable.ic_dialog_alert).show();
}