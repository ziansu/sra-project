@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paint(g);
    g.drawImage(classicBoard.getSprite(currentIndexSprite).getImagen(), pixel.x, pixel.y, Variables.spriteRenderWidth, Variables.spriteRenderHeight, null);
    g.drawRect(limit.x, limit.y, limit.width, limit.height);
    if (!(epacman.characters.FOODS.contains(limit))) {
        epacman.characters.FOODS.add(new java.awt.Rectangle(limit));
    }
}