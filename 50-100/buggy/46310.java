void fillCanvas(char character) {
    for (int i = 0; i < (this.sizeX); i++)
        for (int j = 0; j < (this.sizeY); j++)
            this.canvas[i][j] = character;
        
    
}