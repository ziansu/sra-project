@java.lang.Override
public void onVote() {
    super.onVote();
    sendChat();
    executeCommand();
    sendPrivateChat();
    final int offlineVoteTimes = java.lang.Integer.parseInt(this.data.getVote_offline());
    if (offlineVoteTimes > 0) {
        if (com.bebehp.mc.simpleforgevotelistener.ConfigurationHandler.offlineVoteEnable) {
            sendCumulativeCountChat();
            for (int i = 0; i < offlineVoteTimes; i++)
                optionalExecuteCommand();
            
        }
        this.data.setVote_offline(0);
    }
    this.voteDataIO.save(this.data);
}