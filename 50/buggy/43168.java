@java.lang.Override
public void onNewData(long timestamp, android.os.Bundle value) {
    this.onNewData(timestamp, value);
    recordFragmentObserver.onNewData(timestamp, value);
}