private void runMission() {
    this.missionResult = new java.util.HashMap<>();
    main.java.game.GameMessages.sendVoteResults(this.channel, this.voteTally);
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    if (this.voteResult(this.voteTally)) {
        this.currentStatus = main.java.game.ResistanceGame.GameStatus.AWAITING_MISSION_RESULT;
    }else {
        this.nextRound();
    }
}