public com.fifa.ninemenmorris.Game.Game getGame() {
    if (!(this.games.isEmpty())) {
        return this.games.get(this.currentGameId);
    }else {
        return null;
    }
}