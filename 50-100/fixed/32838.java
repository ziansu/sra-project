public void startService(android.view.View view) {
    myReceiver = new com.example.android.dat_running_app.FreeRunningScreen.MyReceiver();
    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(FreeRunningScreenService.MY_ACTION);
    registerReceiver(myReceiver, intentFilter);
    android.content.Intent intent = new android.content.Intent(this, com.example.android.dat_running_app.FreeRunningScreenService.class);
    startService(intent);
}