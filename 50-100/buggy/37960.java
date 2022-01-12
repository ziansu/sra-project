private void renderBagButton(int xOffset, int yOffset) {
    int bagPosX = ((xOffset + (View.WIDTH)) - (Sprite.bag.WIDTH)) - 1;
    int bagPosY = ((xOffset + (View.HEIGHT)) - (Sprite.bag.HEIGHT)) - 1;
    gs.renderSprite(Sprite.bag, bagPosX, bagPosY, xOffset, yOffset);
}