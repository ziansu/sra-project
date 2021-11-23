@java.lang.Override
public void onStop() {
    super.onStop();
    com.growthbeat.Growthbeat.getInstance().stop();
}