@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    mConnectedThread.write("b");
    botMap.put("status", "offline");
    botref.child(roomName).updateChildren(botMap);
}