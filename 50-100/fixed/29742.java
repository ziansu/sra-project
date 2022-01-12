public com.badlogic.gdx.physics.box2d.Body getNextBod() {
    if (((count) + 1) == (com.mygdx.magicappgame.levels.Level.NUM_BODIES)) {
        levelComplete = true;
    }
    bod = drawSquare(levelCoord.get(count).x, levelCoord.get(count).y);
    (count)++;
    return bod;
}