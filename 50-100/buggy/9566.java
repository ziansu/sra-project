public void onClick(android.view.View v) {
    bSave.setVisibility(View.INVISIBLE);
    mode = MODE_RECEIVE_CONFIG;
    Protocol.mode = Protocol.ESP8266_CONFIG;
    com.example.mydhcp.settingsActivity._BC_ACTION = new byte[2];
    com.example.mydhcp.settingsActivity._BC_ACTION[0] = Protocol.READ_DAY_CONFIGS;
    com.example.mydhcp.settingsActivity._BC_ACTION[1] = ((byte) (1));
    pb.setVisibility(View.VISIBLE);
    sDayType = "Рабочий день";
    wifiRequestData(MainDHCPActivity.curIPbytes);
}