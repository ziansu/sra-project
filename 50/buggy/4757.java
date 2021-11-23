public void start() {
    countDownHandler.cancel();
    android.util.Log.d("waleola", "called start..in CountDownManager");
    countDownHandler.start();
}