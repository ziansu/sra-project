public void showNotificationPopUp(java.lang.String from, java.lang.String msg) {
    android.content.Intent dialogIntent = new android.content.Intent(ctx, com.android.anurag.notesapp.AlertDialog.class);
    dialogIntent.putExtra("sender_name", from);
    dialogIntent.putExtra("msg", msg);
    dialogIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(dialogIntent);
}