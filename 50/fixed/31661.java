public int getRent() {
    if ((isMortgaged()) || ((railRoadsOwned()) == 0))
        return 0;
    
    return RENT[((railRoadsOwned()) - 1)];
}