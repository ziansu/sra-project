public void gameTick() {
    super.gameTick();
    (spriteDelay)++;
    if ((spriteDelay) >= 10) {
        (sprite)++;
        if ((sprite) == (spriteMax)) {
            sprite = 0;
        }
        spriteDelay = 0;
    }
}