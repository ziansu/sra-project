public void deleteBlockchainAndRestartApp(android.content.Context context, android.app.Dialog dialog) {
    android.util.Log.d(TAG, "RESETTING BLOCKCHAIN");
    resetBlockchain();
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    android.content.Intent intent = new android.content.Intent(context, com.aegiswallet.actions.MainActivity.class);
    java.util.Date date = new java.util.Date();
    if (dialog != null)
        dialog.dismiss();
    
    context.startActivity(intent);
}