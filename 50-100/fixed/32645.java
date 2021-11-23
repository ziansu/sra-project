public void placeTileAt(Model.Tile.BuildTile tile, Model.Utility.ILocation location) {
    buildMap.addTile(tile, location);
    for (Model.Utility.ILocation loc : location.getAdjacent()) {
        if (slotExistsAt(loc)) {
            this.updateSlot(loc);
        }else
            if (!(buildMap.tileExistsAt(loc))) {
                this.createSlotAt(loc);
            }
        
    }
    slots.remove(location);
}