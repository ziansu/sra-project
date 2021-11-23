public static AlertDialog.Builder generateDialog(android.content.Context context, java.lang.String title, java.lang.String message) {
    return new android.support.v7.app.AlertDialog.Builder(context, R.style.DialogTheme).setTitle(title).setMessage(message);
}