@java.lang.Override
public void run() {
    try {
        mClient.disconnect();
    } catch (org.eclipse.paho.client.mqttv3.MqttException ex) {
        ex.printStackTrace();
    }
    mClient = null;
    mStarted = false;
    sanityTimerStop();
    statusIcon(false);
}