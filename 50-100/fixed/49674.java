private char[][] deepCopy(char[][] state) {
    int size = state.length;
    char[][] copy = new char[size][size];
    for (int i = 0; i < size; i++)
        for (int j = 0; j < size; j++)
            copy[i][j] = state[i][j];
        
    
    return copy;
}