@java.lang.Override
public void messageReceived(de.mhid.android.timerecordingforpebble.PebbleMessenger msgr, com.getpebble.android.kit.util.PebbleDictionary dict) {
    evtRequestStatus(firstTimelineUpdate, true, false);
    firstTimelineUpdate = false;
}