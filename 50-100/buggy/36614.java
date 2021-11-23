public net.hollowbit.archipelo.world.Tile getTileTypeAtLocation(int x, int y) {
    if ((((x < 0) || (x >= (tileData[0].length))) || (y < 0)) || (y >= (tileData.length)))
        return null;
    
    return net.hollowbit.archipelo.ArchipeloClient.getGame().getMapElementManager().getTile(tileData[y][x]);
}