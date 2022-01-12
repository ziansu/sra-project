void fillCanvas(char character) {
    for (int i = 0; i < (this.sizeY); i++)
        for (int j = 0; j < (this.sizeX); j++)
            this.canvas[i][j] = character;
        
    
}