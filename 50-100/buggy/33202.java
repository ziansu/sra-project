private void InitialSDK() {
    android.widget.Toast.makeText(getApplicationContext(), "M2", Toast.LENGTH_SHORT).show();
    anychat = new com.bairuitech.anychat.AnyChatCoreSDK();
    anychat.SetBaseEvent(this);
    anychat.mSensorHelper.InitSensor(this);
    int RoomID = getIntent().getIntExtra("RoomID", 0);
    anychat.EnterRoom(RoomID, "");
}