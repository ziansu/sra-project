public int getPermutationID() {
    int r = ((int) (getRotation())) % 360;
    if (r == 0)
        return 0;
    
    if ((r == 90) || (r == (-270)))
        return 3;
    
    if ((r == 180) || (r == (-180)))
        return 2;
    
    if ((r == 270) || (r == (-90)))
        return 1;
    
    return 0;
}