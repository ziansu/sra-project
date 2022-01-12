public void randomSeed(int percent) {
    for (int i = 0; i < (gameBoardSize.width); i++)
        for (int j = 0; j < (gameBoardSize.height); j++)
            if ((randomGenerator.nextInt(100)) < percent)
                addCell(i, j);
            
        
    
}