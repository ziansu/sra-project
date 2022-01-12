public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.dismiss();
    saveData();
    scheduleNotifications();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.ast.blocksave.DashboardActivity.class);
    startActivity(intent);
}