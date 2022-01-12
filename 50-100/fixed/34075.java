public void addBatch(java.lang.String playerList) {
    swissTournamentRunner.Tournament.logger.info(("addBatch: " + playerList));
    java.lang.String[] names = playerList.split(",");
    java.util.ArrayList<java.lang.String> newPlayerNames = new java.util.ArrayList<>();
    for (java.lang.String s : names) {
        newPlayerNames.add(s);
    }
    for (java.lang.String s : newPlayerNames) {
        addPlayer(swissTournamentRunner.Utils.trimWhitespace(s));
        postListOfConfirmedSignups();
    }
}