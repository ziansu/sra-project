public Cat breedWith(Cat otherCat, int givenId) {
    int newId = givenId;
    boolean newGender;
    if ((java.lang.Math.random()) < 0.5)
        newGender = true;
    else
        newGender = false;
    
    if (breedingPossible(otherCat)) {
        int newX = 0;
        int newY = 0;
        return new Cat(newId, 0, newGender, getMap(), newX, newY);
    }else
        return null;
    
}