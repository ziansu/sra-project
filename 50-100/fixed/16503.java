public boolean checkNewHighScore(int category, int score) {
    if ((category < 1) || (category > 5))
        return false;
    
    int offset = (category - 1) * 5;
    for (int i = 0; i < 5; i++) {
        if ((scores[(offset + i)].getScore()) < score)
            return true;
        
    }
    return false;
}