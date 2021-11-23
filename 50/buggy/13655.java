public void leaveGame() {
    if (mJoinedFlag) {
        com.tieto.crterminal.model.command.JsonCRTCommand command = com.tieto.crterminal.model.command.JsonCommandBuilder.buildLeaveGameCommand(mName);
        mConnection.sendMsgToServer(command.toString());
        mConnection.closeConnection();
        playersMap.clear();
        mJoinedFlag = false;
    }
}