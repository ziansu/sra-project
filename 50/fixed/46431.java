public com.aidancbrady.vocabserver.game.Game findRequestGame(com.aidancbrady.vocabserver.Account user, com.aidancbrady.vocabserver.Account opponent) {
    for (com.aidancbrady.vocabserver.game.Game g : user.requestGames) {
        if (g.hasUser(opponent.username)) {
            return g;
        }
    }
    return null;
}