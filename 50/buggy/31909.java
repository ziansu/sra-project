@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.ContentValues headers = new android.content.ContentValues();
    headers.put("Authorization", "09703443d12cf0adf39e49f8048ea692dc3da55da2e6377dded3204dca6cc939895fd01cccdec573");
    com.gjuddy.easyhttprequest.GjuddyRequest.getInstance().setPersistentHeaders(headers);
}