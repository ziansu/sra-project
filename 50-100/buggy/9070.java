protected void readGraphicsFromLibrary(int templateID, double xCoor, double yCoor) {
    if (((this) instanceof com.nkoiv.mists.game.gameobject.Structure) && ((com.nkoiv.mists.game.Mists.structureLibrary) != null)) {
        com.nkoiv.mists.game.gameobject.Structure dummy = Mists.structureLibrary.create(templateID);
        if (dummy == null)
            return ;
        
        this.graphics = dummy.graphics;
    }else
        this.graphics = new com.nkoiv.mists.game.sprites.Sprite();
    
    this.graphics.setPosition(xCoor, yCoor);
}