public int validTiles() {
    int count = 0;
    for (int i = 0; i < 12; i++)
        for (int j = 0; i < 12; i++) {
            if (((tiles[i][j]) != null) && (tiles[i][j].isValid()))
                count++;
            
        }
    
    return count;
}