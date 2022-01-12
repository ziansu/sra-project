private void setPlayerHandOffset(int player, int offset) {
    switch (player) {
        case 0 :
            this.player0HandOffset = offset;
        case 1 :
            this.player1HandOffset = offset;
        case 2 :
            this.player2HandOffset = offset;
        case 3 :
            this.player3HandOffset = offset;
    }
}