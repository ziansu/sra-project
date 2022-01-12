public boolean blockSolid(int x, int y) {
    if (!(net.pixelstatic.koru.modules.World.inBounds(x, y)))
        return true;
    
    return (tiles[x][y].block.solid()) || (tiles[x][y].tile.solid());
}