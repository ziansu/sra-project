public void checkPosition(float X_pos, float Y_pos) {
    java.util.Random generator = new java.util.Random();
    if (!(com.mygdx.game.PlayScreen.blocked(X_pos, Y_pos, com.mygdx.game.Timer.tiledMap))) {
        this.X_pos = X_pos;
        this.Y_pos = Y_pos;
    }
    while (com.mygdx.game.PlayScreen.blocked(X_pos, Y_pos, com.mygdx.game.Timer.tiledMap)) {
        this.X_pos = (generator.nextInt(PlayScreen.V_WIDTH)) + 1;
        this.Y_pos = (generator.nextInt(PlayScreen.V_HEIGHT)) + 1;
    } 
}