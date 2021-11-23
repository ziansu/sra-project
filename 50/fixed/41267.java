public void pushToVote(net.dv8tion.jda.core.entities.User[] members) {
    main.java.game.GameMessages.sendPrivateVoteMessage(this.players);
    this.currentMission = members;
    this.currentStatus = main.java.game.ResistanceGame.GameStatus.AWAITING_MISSION_VOTE;
    main.java.game.GameMessages.sendMissionIntro(this.channel, this.currentMission);
}