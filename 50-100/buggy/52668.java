public boolean blockSolid(int x, int y) {
    if (!(net.pixelstatic.koru.modules.World.inBounds(x, y)))
        return true;
    
    return (tiles[x][y].block.getType().solid()) || (tiles[x][y].tile.getType().solid());
}