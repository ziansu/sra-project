public void moveFromInput(int keycode) {
    switch (keycode) {
        case Input.Keys.ESCAPE :
            Gdx.app.exit();
        case Input.Keys.UP :
            world.movePlayer(Direction.NORTH);
            break;
        case Input.Keys.RIGHT :
            world.movePlayer(Direction.EAST);
            break;
        case Input.Keys.DOWN :
            world.movePlayer(Direction.SOUTH);
            break;
        case Input.Keys.LEFT :
            world.movePlayer(Direction.WEST);
            break;
        default :
            break;
    }
}