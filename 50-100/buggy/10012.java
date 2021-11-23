public boolean validate(Model.Tile.BuildTile target, Model.Utility.ILocation loc) {
    if (slots.isEmpty()) {
        return true;
    }
    if (((buildMap.tileExistsAt(loc)) || (!(this.slotExistsAt(loc)))) || (!(buildMap.locationInBounds(loc)))) {
        return false;
    }
    Model.Map.Slot mySlot = slots.get(loc);
    return mySlot.checkMatch(target.getEdges());
}