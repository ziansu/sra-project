public void leaveGame() {
    com.tieto.crterminal.model.command.JsonCRTCommand command = com.tieto.crterminal.model.command.JsonCommandBuilder.buildLeaveGameCommand(mName);
    mConnection.sendMsgToServer(command.toString());
    playersMap.clear();
    mJoinedFlag = false;
}