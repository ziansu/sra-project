@java.lang.Override
public void onVote() {
    int voteCount = java.lang.Integer.parseInt(this.data.getVote());
    this.data.setVote((++voteCount));
    sendOfflineChat();
    if ((this.uuid) != null) {
        if (com.bebehp.mc.simpleforgevotelistener.ConfigurationHandler.offlineVoteEnable) {
            int offlineVoteCount = java.lang.Integer.parseInt(this.data.getVote_offline());
            this.data.setVote_offline((offlineVoteCount++));
        }
        this.voteDataIO.save(this.data);
    }
}