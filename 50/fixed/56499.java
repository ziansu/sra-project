public void dispTile(bwapi.TilePosition tilepos, bwapi.Color col, int nframes) {
    if (nframes > 0)
        _msg.add(new DisplayManager.DisplayMsg(null, null, null, null, null, tilepos, col, nframes));
    
}