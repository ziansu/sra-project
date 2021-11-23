protected void readGraphicsFromLibrary(int templateID, double xCoor, double yCoor) {
    if ((com.nkoiv.mists.game.Mists.structureLibrary) != null) {
        com.nkoiv.mists.game.gameobject.Structure dummy = Mists.structureLibrary.create(templateID);
        if (dummy == null)
            return ;
        
        this.graphics = dummy.graphics;
        this.extraSprites = dummy.extraSprites;
    }else
        this.graphics = new com.nkoiv.mists.game.sprites.Sprite();
    
    this.graphics.setPosition(xCoor, yCoor);
}