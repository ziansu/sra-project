public void update(float delta) {
    if (gameState.equals(com.cpratt.gameworld.GameWorld.GameState.SPLASH)) {
        return ;
    }
    player.update(delta);
    com.cpratt.helpers.Collider.handleCollisions(player, blocks);
    courseGenerator.handleCourseGeneration();
    score = ((int) (player.getX()));
    if ((player.getY()) > (com.cpratt.settings.GS.SCREEN_HEIGHT)) {
        reset();
    }
}