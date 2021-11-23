private void doHabPosition(org.thehellnet.shab.protocol.line.HabPositionLine line) {
    org.thehellnet.shab.protocol.helper.Position position = new org.thehellnet.shab.protocol.helper.Position(line.getLatitude(), line.getLongitude(), line.getAltitude());
    shabContext.getHab().setPosition(position);
    shabContext.getHab().setFixStatus(line.getFixStatus());
    android.content.Intent intent = new android.content.Intent(org.thehellnet.shab.mobile.config.I.COMMAND_HAB_POSITION);
    sendBroadcast(intent);
}