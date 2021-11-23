public final mytown.datasource.TownBlock newBlock(int dim, int x, int z, boolean isFarClaim, int pricePaid, mytown.datasource.Town town) {
    if (!(worlds.contains(dim))) {
        getDatasource().saveWorld(dim);
    }
    mytown.datasource.TownBlock block = new mytown.datasource.TownBlock(dim, x, z, isFarClaim, pricePaid, town);
    if (mytown.datasource.TownBlockEvent.fire(new mytown.datasource.TownBlockEvent.BlockCreateEvent(block)))
        return null;
    
    return block;
}