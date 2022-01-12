private int getPlayerRank() {
    int rank = -1;
    int count = 0;
    for (int i = 0; i < (Game.HI_SCORES.size()); i++) {
        if ((player.getScore()) >= (Game.HI_SCORES.get(i).getScore()))
            rank = (Game.HI_SCORES.size()) - (++count);
        
    }
    return rank;
}