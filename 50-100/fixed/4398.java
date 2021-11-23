public de.hsa.games.fatsquirrel.core.Entity getEntityAtPosition(int positionInList) {
    if (!(isEmpty())) {
        current = listTail;
        for (int currentPosition = this.getSize(); currentPosition > positionInList; currentPosition--) {
            if ((current) != null)
                current = current.getPreviousElement();
            
        }
        if ((current) != null) {
            return ((de.hsa.games.fatsquirrel.core.Entity) (current.getData()));
        }
    }
    current = listTail;
    return null;
}