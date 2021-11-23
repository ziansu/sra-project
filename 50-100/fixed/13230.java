public void deleteBlockchainAndRestartApp(android.content.Context context, android.app.Dialog dialog) {
    android.util.Log.d(TAG, "RESETTING BLOCKCHAIN");
    resetBlockchain();
    android.content.Intent intent = new android.content.Intent(context, com.aegiswallet.actions.MainActivity.class);
    if (dialog != null)
        dialog.dismiss();
    
    context.startActivity(intent);
}