public com.aidancbrady.vocabserver.game.Game findRequestGamePair(com.aidancbrady.vocabserver.Account user, com.aidancbrady.vocabserver.Account opponent) {
    for (com.aidancbrady.vocabserver.game.Game g : opponent.requestGames) {
        if ((g.activeRequested) && (g.hasUser(user.username))) {
            return g;
        }
    }
    return null;
}