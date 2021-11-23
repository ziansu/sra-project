public boolean validHash(int difficulty, int hash) {
    if (difficulty > 8)
        difficulty = 8;
    
    if (difficulty < 0)
        difficulty = 0;
    
    int shift = 32 - (4 * difficulty);
    int check = hash >> shift;
    if (check > 0) {
        return false;
    }
    return true;
}