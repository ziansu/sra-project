@java.lang.Override
public void onClick(android.view.View v) {
    java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    hashMap.put(StaticConstants.AUTHOR_DATA_LOCATION, StaticConstants.LOCATION_READ_BUTTON);
    mActionListener.sendAmplitudeEvent(StaticConstants.CONTENT_MAIN_READ, null, hashMap);
    mActionListener.loadReader();
}