public static void showUnderDevelopmentDialog(android.content.Context context) {
    new android.app.AlertDialog.Builder(context).setMessage(R.string.under_development_message).setPositiveButton(context.getString(R.string.ok), null).show();
}