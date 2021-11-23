void die() {
    for (bork.Item item : inventory) {
        remove(item);
        this.currentRoom.add(item);
    }
    this.currentRoom.removeNPC(this);
    bork.GameState.instance().getDungeon().removeNPC(this.name);
}