public void divideStores(java.util.ArrayList<misc.Location> validStores, misc.Location base) {
    if ((validStores.size()) < 1)
        return ;
    
    if (base == null)
        return ;
    
    if ((numOfDrivers) == 1)
        divideByOne(validStores, base);
    
    if ((numOfDrivers) == 2)
        divideByTwo(validStores, base);
    
    if ((numOfDrivers) == 4)
        divideByFour(validStores, base);
    
}