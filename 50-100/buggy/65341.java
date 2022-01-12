@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.d(com.sam_chordas.android.stockhawk.service.StockIntentService.class.getSimpleName(), "Stock Intent Service");
    com.sam_chordas.android.stockhawk.service.StockTaskService stockTaskService = new com.sam_chordas.android.stockhawk.service.StockTaskService(this);
    android.os.Bundle args = new android.os.Bundle();
    if (intent.getStringExtra("tag").equals("add")) {
        args.putString("symbol", intent.getStringExtra("symbol"));
    }
    stockTaskService.onRunTask(new com.google.android.gms.gcm.TaskParams(intent.getStringExtra("tag"), args));
}