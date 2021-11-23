public view.ISprite[][] digUp(int colonne, int ligne, view.ISprite sprite) {
    this.sprites[ligne][colonne] = new view.Sprite(image, (colonne * (SET_SIZE)), (ligne * (SET_SIZE)));
    sprite.setY(((sprite.getY()) - 16));
    this.sprites[(ligne - 1)][colonne] = sprite;
    return this.sprites;
}