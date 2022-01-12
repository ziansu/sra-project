private int getInternalIndexOfObjectAt(int index) throws java.lang.IndexOutOfBoundsException {
    int nbObjectsSoFar = 0;
    int pos = 0;
    while (nbObjectsSoFar < index) {
        jumpingalien.model.Characters currentObject = objects.get(pos);
        if ((currentObject != null) && ((objects.indexOf(currentObject)) == pos))
            nbObjectsSoFar++;
        
        pos++;
    } 
    return pos - 1;
}