public boolean addUsesRelation(ParseClasses.IRelation relation) {
    if ((!(this.associationRels.contains(relation))) || (!(this.usesRels.contains(relation)))) {
        this.usesRels.add(relation);
        return true;
    }
    return false;
}