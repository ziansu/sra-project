@java.lang.Override
public void onEvent(int eventType, android.os.Bundle params) {
    printe(((("onEvent: type " + eventType) + ", with params: ") + (toString(params.keySet()))));
}