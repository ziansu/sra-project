public int getPlayer1Score() {
    int score = 0;
    for (int i = (this.glasses.length) - 1; i >= ((this.glasses.length) / 2); i++) {
        if (this.glasses[i].isActive())
            break;
        else
            score++;
        
    }
    return score;
}