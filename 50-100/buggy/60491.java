private void updateBlockGridPositions() {
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
            if ((blocks[i][j]) != null)
                blocks[i][j].setGridPos((j + (this.xPos)), (i + (this.yPos)));
            
        
    
}