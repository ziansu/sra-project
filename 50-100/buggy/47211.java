public Coordinate findSoda(Soda soda) {
    for (short ctZ = 0; ctZ < 2; ctZ++)
        for (short ctY = 0; ctY < (COLUMNS); ctY++)
            for (short ctX = 0; ctX < (ROWS); ctX++)
                if ((inv[ctX][ctY][ctZ]) == soda)
                    return new Coordinate(ctX, ctY, ctZ);
                
            
        
    
    return null;
}