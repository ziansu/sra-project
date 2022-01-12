protected void readGraphicsFromLibrary(int templateID, double xCoor, double yCoor) {
    if ((com.nkoiv.mists.game.Mists.structureLibrary) != null) {
        com.nkoiv.mists.game.gameobject.Structure dummy = Mists.structureLibrary.create(templateID);
        if (dummy != null) {
            this.graphics = dummy.graphics;
            this.extraSprites = dummy.extraSprites;
        }
    }
    if ((this.graphics) == null)
        this.graphics = new com.nkoiv.mists.game.sprites.Sprite();
    
    this.setPosition(xCoor, yCoor);
}