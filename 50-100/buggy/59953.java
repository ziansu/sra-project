public void render(graphics.Screen screen) {
    inventory.update(x, y);
    screen.renderSprite(x, y, this.sprite);
    if ((inventory) != null)
        inventory.render(screen);
    
    screen.renderSprite(x, y, hair);
    if ((holding) != null)
        screen.renderSprite(x, y, holding.sprite);
    
    screen.renderSelection(x, y, this);
}