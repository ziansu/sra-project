public void run() {
    android.util.Log.d("MY", "start init BT");
    b.init();
    control.postDelayed(new andreyanov.carcontrol.MainActivity.ControlSendRunner(), 1000L);
}