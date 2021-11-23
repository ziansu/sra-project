@com.facebook.react.bridge.ReactMethod
public void addEvent(java.lang.String title, java.lang.String location, java.lang.String begin, java.lang.String end) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_EDIT);
    intent.setType("vnd.android.cursor.item/event");
    intent.putExtra("title", title);
    intent.putExtra("location", location);
    intent.putExtra("beginTime", java.lang.Long.parseLong(begin));
    intent.putExtra("endTime", java.lang.Long.parseLong(end));
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivity(intent);
}