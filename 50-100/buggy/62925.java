void writeBuffer() {
    for (int i = 0; i < (buffSize()); i++) {
        Tile temp = buffer.get(i);
        this.g.getTile(temp.getID()).copyTile(temp);
        this.g.unlockTile(this, i);
    }
}