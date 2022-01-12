@java.lang.Override
public void create() {
    time = 0.0F;
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    room = com.mygdx.game.RoomGenerator.newRoom(Room.DEFAULT_WIDTH, Room.DEFAULT_HEIGHT);
    room.setX((((Gdx.graphics.getWidth()) / 2) - ((room.getWidth()) / 2)));
    room.setY((((Gdx.graphics.getHeight()) / 2) - ((room.getHeight()) / 2)));
}