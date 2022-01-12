public void recordMiss() {
    this.throwSequence.add(capstat.utils.Throw.createMiss());
    if (this.isDuelling()) {
        this.notifyDuelObservers();
        this.removeGlass();
        this.endMatchIfNecessary();
    }else {
        this.switchPlayerUpNext();
    }
}