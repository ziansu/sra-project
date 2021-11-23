@java.lang.Override
public void onFinish() {
    timeTillNext.setText("Some of your luggage arrives now.");
    this.showNotification();
    countDownPartial.start();
}