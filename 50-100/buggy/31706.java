@java.lang.Override
public boolean keyDown(int keycode) {
    if (keycode == (Input.Keys.Z)) {
    }
    if (keycode == (Input.Keys.ESCAPE)) {
        quit();
    }else
        if (keycode == (Input.Keys.SPACE)) {
            if (!(currentRoom.doorsAreOpen())) {
                currentRoom.openDoors();
            }else {
                currentRoom.closeDoors();
            }
        }
    
    player.keyPressed(keycode);
    return true;
}