private void runMission() {
    int i;
    main.java.game.GameMessages.sendPrivateMissionMessage(this.currentMission);
    this.missionResult = new java.util.HashMap<>();
    main.java.game.GameMessages.sendVoteResults(this.channel, this.voteTally);
    if (this.voteResult(this.voteTally)) {
        this.currentStatus = main.java.game.ResistanceGame.GameStatus.AWAITING_MISSION_RESULT;
    }else {
        this.nextRound();
    }
}