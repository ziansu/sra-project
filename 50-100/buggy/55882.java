@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paint(g);
    g.drawImage(classicBoard.getSprite(currentIndexSprite).getImagen(), pixel.x, pixel.y, Variables.spriteRenderWidth, Variables.spriteRenderHeight, null);
    g.drawRect(limit.x, limit.y, limit.width, limit.height);
    if (!(epacman.characters.FOODS.containsKey(limit))) {
        epacman.characters.FOODS.put(new java.awt.Rectangle(limit), true);
    }
}