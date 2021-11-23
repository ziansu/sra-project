@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    gcmToken = intent.getStringExtra(com.example.team11.MedicineActivity.GCMTOKEN);
    registerWithNotificationHubs();
}