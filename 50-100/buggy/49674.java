private char[][] deepCopy(char[][] state) {
    char[][] copy = new char[4][4];
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
            copy[i][j] = state[i][j];
        
    
    return copy;
}