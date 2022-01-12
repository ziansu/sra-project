private void updateBlockGridPositions() {
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
            if ((this.blocks[i][j]) != null)
                this.blocks[i][j].setGridPos((j + (this.xPos)), (i + (this.yPos)));
            
        
    
}