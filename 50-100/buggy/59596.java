private void startList() {
    final android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.sinch.messagingtutorialskeleton.ListUserActivity.class);
    final android.content.Intent serviceIntent = new android.content.Intent(getApplicationContext(), com.sinch.messagingtutorialskeleton.MessageService.class);
    startService(serviceIntent);
    startActivity(intent);
    finish();
}