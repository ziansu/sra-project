public view.ISprite[][] digRight(int colonne, int ligne, view.ISprite sprite) {
    this.sprites[ligne][colonne] = new view.Sprite(image, (colonne * (SET_SIZE)), (ligne * (SET_SIZE)));
    sprite.setX(((sprite.getX()) + 16));
    this.sprites[ligne][(colonne + 1)] = sprite;
    return this.sprites;
}