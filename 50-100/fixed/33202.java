private void InitialSDK() {
    anychat = new com.bairuitech.anychat.AnyChatCoreSDK();
    anychat.SetBaseEvent(this);
    anychat.mSensorHelper.InitSensor(this);
    int RoomID = getIntent().getIntExtra("RoomID", 0);
    anychat.EnterRoom(RoomID, "");
}