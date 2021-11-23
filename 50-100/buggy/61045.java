public view.ISprite[][] digLeft(int colonne, int ligne, view.ISprite sprite) {
    this.sprites[colonne][ligne] = new view.Sprite(image, (colonne * (SET_SIZE)), (ligne * (SET_SIZE)));
    sprite.setX(((sprite.getX()) - 16));
    this.sprites[(colonne - 1)][ligne] = sprite;
    return this.sprites;
}