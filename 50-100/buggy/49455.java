protected void onPause() {
    super.onPause();
    android.util.Log.d("HunterTask", "onPause() invoked.");
    if (_receiverRegistered) {
        unregisterReceiver(receiver);
        _receiverRegistered = false;
    }
    if (((_task) != null) && (!(_task.isCancelled())))
        _task.cancel(true);
    
    if (((_distance) != null) && (!(_distance.isCancelled())))
        _distance.cancel(true);
    
}