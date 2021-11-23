@java.lang.Override
public void onClick(android.view.View v) {
    java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    hashMap.put(StaticConstants.AUTHOR_DATA_LOCATION, StaticConstants.LOCATION_COVER_IMAGE);
    mActionListener.sendAmplitudeEvent(StaticConstants.CONTENT_BOOK_COVER_CLICKED, null, hashMap);
    openReaderUi(mPratilipi);
}