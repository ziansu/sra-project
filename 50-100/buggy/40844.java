public int getIndexOfObject(jumpingalien.model.Characters object) throws java.lang.IllegalArgumentException {
    if (!(hasAsObject(object)))
        throw new java.lang.IllegalArgumentException();
    
    int nbObjectsSoFar = 0;
    int index = 0;
    jumpingalien.model.Characters currentObject = objects.get(index);
    while (currentObject != object) {
        currentObject = objects.get(index);
        if ((currentObject != null) && ((objects.indexOf(currentObject)) == index))
            nbObjectsSoFar++;
        
        index++;
    } 
    return nbObjectsSoFar;
}