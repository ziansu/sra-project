public boolean isGameOver() {
    for (int i = 0; i < (engine.Field.WIDTH); i++)
        if ((fixmatrix[1][i]) != 0)
            return true;
        
    
    return false;
}