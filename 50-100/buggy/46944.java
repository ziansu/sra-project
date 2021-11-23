public view.ISprite[][] digUp(int colonne, int ligne, view.ISprite sprite) {
    this.sprites[colonne][ligne] = new view.Sprite(image, (colonne * (SET_SIZE)), (ligne * (SET_SIZE)));
    sprite.setY(((sprite.getY()) - 16));
    this.sprites[colonne][(ligne - 1)] = sprite;
    return this.sprites;
}