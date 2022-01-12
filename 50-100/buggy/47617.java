public char getStateRep() {
    char toReturn = ' ';
    if ((_state) == (State.DEAD)) {
        toReturn = ' ';
    }else
        if ((_state) == (State.ALIVE)) {
            toReturn = '*';
        }else {
            com.laboon.HEAD toReturn = '_';
            toReturn = ' ';
        }
    
    return toReturn;
}