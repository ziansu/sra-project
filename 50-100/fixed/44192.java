public boolean detectCollision(java.util.ArrayList<game.character.Character> data) {
    java.util.ArrayList<game.character.Character> moving = data;
    boolean collision = false;
    int length = moving.size();
    for (int i = 0; i < length; i++) {
        game.character.Character character = moving.get(i);
        if (collision = collides(character)) {
            character.collide();
        }else {
        }
    }
    return collision;
}