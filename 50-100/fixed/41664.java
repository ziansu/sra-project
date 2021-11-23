public void updateAllWallCorners() {
    for (int i = 0; i < (wCornerStyles.length); i++)
        for (int j = 0; j < (wCornerStyles[0].length); j++)
            for (int e = 0; e < (wCornerStyles[0][0].length); e++)
                checkWCorner(e, i, j);
            
        
    
}