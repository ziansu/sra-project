public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
    dialog.cancel();
}