public de.hsa.games.fatsquirrel.core.Entity getEntityAtPosition(int positionInList) {
    if (!(isEmpty())) {
        int currentPosition = this.getSize();
        current = listTail;
        while (currentPosition > positionInList) {
            currentPosition--;
            current = current.getPreviousElement();
        } 
        return ((de.hsa.games.fatsquirrel.core.Entity) (current.getData()));
    }
    current = listTail;
    return null;
}