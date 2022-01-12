public void recordMiss() {
    if (this.isDuelling()) {
        this.notifyDuelObservers();
        this.removeGlass();
        this.endMatchIfNecessary();
    }else {
        this.switchPlayerUpNext();
    }
    this.throwSequence.add(capstat.utils.Throw.createMiss());
}