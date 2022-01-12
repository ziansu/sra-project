public void spritesCreation(final int SET_SIZE) {
    ligne = 0;
    for (java.awt.Image[] sousImg : map) {
        x = 0;
        colonne = 0;
        for (java.awt.Image img : sousImg) {
            sprites[ligne][colonne] = new view.Sprite(img, x, y);
            x = (x) + SET_SIZE;
            (colonne)++;
        }
        y = (y) + SET_SIZE;
        (ligne)++;
    }
}