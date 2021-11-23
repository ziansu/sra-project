public int getRent() {
    if (isMortgaged())
        return 0;
    
    return RENT[railRoadsOwned()];
}