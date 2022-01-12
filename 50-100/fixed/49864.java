public main.woj.gameplay.Player getCurrentWinner() {
    if ((this.getPlayer1Information().getGameScore()) < (this.getPlayer2Information().getGameScore())) {
        return this.getPlayer2Information();
    }else
        if ((this.getPlayer1Information().getGameScore()) > (this.getPlayer2Information().getGameScore())) {
            return this.getPlayer1Information();
        }else {
            return null;
        }
    
}