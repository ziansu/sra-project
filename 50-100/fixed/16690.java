@java.lang.Override
public void onClick(android.view.View v) {
    java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    hashMap.put(StaticConstants.AMPLITUDE_AUTHOR_ID, mPratilipi.getAuthorId());
    mActionListener.sendAmplitudeEvent(StaticConstants.CONTENT_MAIN_AUTHOR, null, hashMap);
    mActionListener.loadAuthorPageRequest();
}