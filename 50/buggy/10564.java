@java.lang.Override
public void onBackPressed() {
    myCountDownTimer.cancel();
    android.content.Intent intent = new android.content.Intent(this, com.randpdevs.calcoff.MainActivity.class);
    startActivity(intent);
}