public int hamming() {
    int counter = -1;
    for (int row = 0; row < (blocks.length); row++) {
        for (int col = 0; col < (blocks.length); col++)
            if ((blocks[row][col]) != ((row * (blocks.length)) + 1))
                counter++;
            
        
    }
    return counter;
}