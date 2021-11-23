@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String token = intent.getStringExtra(com.example.team11.MedicineActivity.GCMTOKEN);
    java.lang.String[] parts = token.split(":");
    gcmToken = parts[1];
    registerWithNotificationHubs();
}