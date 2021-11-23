public static void info(java.lang.String title, java.lang.String text, android.content.Context context) {
    new android.app.AlertDialog.Builder(context).setTitle(title).setMessage(text).setPositiveButton(android.R.string.yes, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int which) {
        }
    }).setIcon(R.drawable.ic_info_outline_grey_800_18dp).show();
}