private void runMission() {
    this.currentStatus = main.java.game.ResistanceGame.GameStatus.AWAITING_MISSION_RESULT;
    this.missionResult = new java.util.HashMap<>();
    main.java.game.GameMessages.sendVoteResults(this.channel, this.voteTally);
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    if (this.voteResult(this.voteTally)) {
        main.java.game.GameMessages.sendMissionIntro(this.channel, this.currentMission);
    }else {
        this.nextRound();
    }
}