@java.lang.Override
public void render(snake_game.GameContainer gc, org.newdawn.slick.state.StateBasedGame stbgame, snake_game.Graphics g) throws snake_game.SlickException {
    snake_game.SnakeHead snake_head = app.getSnakeHead();
    float x = snake_head.x_position;
    float y = snake_head.y_position;
    org.newdawn.slick.geom.Rectangle rectangle_shape = new org.newdawn.slick.geom.Rectangle(x, y, snake_game.GameViewer.ITEMSIZE, snake_game.GameViewer.ITEMSIZE);
    g.draw(rectangle_shape);
    g.fill(rectangle_shape);
}