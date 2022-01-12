public com.badlogic.gdx.math.Vector2 nextPosition() {
    int offset;
    if (getFaceLeft()) {
        offset = -(com.retroMachines.game.gameelements.RetroMan.ELEMENT_OFFSET);
    }else {
        offset = (hasPickedUpElement()) ? com.retroMachines.game.gameelements.RetroMan.ELEMENT_OFFSET : com.retroMachines.game.gameelements.RetroMan.ELEMENT_OFFSET;
    }
    com.badlogic.gdx.math.Vector2 elementPos = new com.badlogic.gdx.math.Vector2((((int) (pos.x)) + offset), ((int) (pos.y)));
    return elementPos;
}