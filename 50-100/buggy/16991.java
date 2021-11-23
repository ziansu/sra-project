public void notifyChallengeComplete() {
    if (((numOfChallengesComplete)++) == (numOfChallenges)) {
        for (com.tigerzone.fall2016server.tournament.tournamentplayer.TournamentPlayer tournamentPlayer : com.tigerzone.fall2016server.server.TournamentServer.tournamentPlayers) {
            tournamentPlayer.sendMessageToPlayer("END OF CHALLENGES");
            tournamentPlayer.sendMessageToPlayer("THANK YOU FOR PLAYING! GOODBYE");
            try {
                tournamentPlayer.closeConnection();
            } catch (java.io.IOException e) {
                java.lang.System.out.println("Couldn't close player connection");
                continue;
            }
        }
        java.lang.System.exit(0);
    }else {
        challenge = new com.tigerzone.fall2016server.tournament.Challenge(this, 2, com.tigerzone.fall2016server.server.TournamentServer.tournamentPlayers);
        challenge.beginChallenge();
    }
}