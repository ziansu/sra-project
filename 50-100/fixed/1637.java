private void cancelChallenge(nl.hanze.gameserver.server.Challenge challenge, boolean notify) {
    if (challenge == null) {
    }else {
        challenge.getPlayer().setChallenge(null);
        challenge.getOpponent().removeChallenge(challenge);
        if (notify) {
            java.lang.String challengeNumberString = nl.hanze.gameserver.util.StringUtils.toStringAsMap("CHALLENGENUMBER", challenge.getChallengeNumber());
            java.lang.String format = "CHALLENGE CANCELLED %s";
            challenge.getOpponent().writeResponse(new nl.hanze.gameserver.server.message.GameResponse(java.lang.String.format(format, challengeNumberString)));
        }
    }
}