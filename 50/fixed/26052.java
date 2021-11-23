public boolean isDuelling() {
    return (!(this.throwSequence.isEmpty())) && (this.throwSequence.getLast().hit());
}