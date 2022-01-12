public void render(graphics.Screen screen) {
    inventory.update(x, y);
    screen.renderSprite(x, y, this.sprite);
    screen.renderSprite(x, y, hair);
    if ((inventory) != null)
        inventory.render(screen);
    
    if ((holding) != null)
        screen.renderSprite(x, y, holding.sprite);
    
    screen.renderSelection(x, y, this);
}