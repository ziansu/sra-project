public void newEvent() {
    android.content.Intent intent = new android.content.Intent(this, com.parse.starter.EventViewerActivity.class);
    intent.putExtra("EVENT_ID", "");
    startActivity(intent);
}