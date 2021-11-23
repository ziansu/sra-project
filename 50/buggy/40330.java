@java.lang.Override
public void onClosed(java.lang.String host) {
    naiveServiceAlarm.onRecovered(getServiceContext(host));
}