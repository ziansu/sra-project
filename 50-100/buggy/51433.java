public void onClick(android.content.DialogInterface dialog, int whichButton) {
    if (cursor.getString(cursor.getColumnIndex(reminderDatabase.DB_COLUMN_TYPE)).equals("alert")) {
        android.content.Intent cancel = new android.content.Intent(this, com.example.kyle.reminder.AlarmService.class);
        cancel.putExtra("id", deleteId);
        cancel.setAction(AlarmService.CANCEL);
        startService(cancel);
    }else {
        database.deleteItem(deleteId);
    }
    refresh();
    dialog.dismiss();
}