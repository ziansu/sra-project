public void addSet(int initPosition) {
    int endPositionSet = this.getEndPositionSet(initPosition);
    if (endPositionSet > 0) {
        ar.fiuba.tdd.template.entities.SetEntity newSet = new ar.fiuba.tdd.template.entities.SetEntity(initPosition, endPositionSet);
        newSet.setElements(this.originalRegularExpr, this.CHAR_ESCAPE);
        newSet.setMultiplicity(this.getMultiplicity(initPosition));
        this.regExVector.addEntity(newSet);
        this.originalRegularExpr = newSet.replaceUsedPosition(this.originalRegularExpr, this.CHAR_USED_POSITION);
    }
}