private final void addCritterToSpace() {
    int index = this.convertCoordToIndex();
    assignment4.Critter.worldLists.get(index).add(this);
}