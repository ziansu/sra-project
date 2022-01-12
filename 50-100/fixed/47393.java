private void newLevel() {
    data.Data.fileChanged = false;
    pekkakana.PK2Sprite psprite = new pekkakana.PK2Sprite("rooster.spr");
    data.Data.map = new pekkakana.PK2Map();
    Data.map.addSprite(psprite, psprite.filename);
    sp.setList();
    data.Data.currentFile = null;
    data.Data.selectedTile = 0;
    msp.setMap();
    sp.setMap();
    tp.setTileset(Data.map.getTileset());
    lp.setMap();
    setFrameTitle("Untitled");
}