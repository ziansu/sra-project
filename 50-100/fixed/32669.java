public boolean validHash(int difficulty, int hash) {
    if (difficulty <= 0)
        return true;
    else
        if (difficulty > 8)
            difficulty = 8;
        
    
    int shift = 32 - (4 * difficulty);
    int check = hash >> shift;
    if (check != 0) {
        return false;
    }
    return true;
}