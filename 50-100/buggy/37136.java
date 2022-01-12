@java.lang.Override
public void onEventMainThread(com.edisonwang.ps.sample.ComplicatedActionEventSample event) {
    onReceived((((((("Got " + (event.getClass().getSimpleName())) + " that was ") + (event.sampleParam3)) + "\n") + "Lucky Numbers were: ") + (java.util.Arrays.toString(event.sampleStringList.toArray()))));
}