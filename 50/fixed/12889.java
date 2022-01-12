protected void showMessageDialog(android.content.Context context, java.lang.String title, java.lang.String msg, java.lang.String posString, android.content.DialogInterface.OnClickListener onClickListener) {
    new android.app.AlertDialog.Builder(context).setTitle(title).setMessage(msg).setPositiveButton(posString, onClickListener).show();
}