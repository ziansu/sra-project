public void kill() {
    if (isDead)
        return ;
    
    (com.knightnight.game.Screens.PlayScreen.score)++;
    com.knightnight.game.Objects.Slime.hit.play();
    isDead = true;
    com.knightnight.game.Screens.PlayScreen.markForDeletion(this);
}