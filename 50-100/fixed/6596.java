private void setPlayerHandOffset(int player, int offset) {
    switch (player) {
        case 0 :
            this.player0HandOffset = offset;
            break;
        case 1 :
            this.player1HandOffset = offset;
            break;
        case 2 :
            this.player2HandOffset = offset;
            break;
        case 3 :
            this.player3HandOffset = offset;
            break;
    }
}