private int getFreePointer() {
    for (int i = 0; i < (touchDown.length); i++) {
        if ((touchDown[i]) == 0)
            return i;
        
    }
    throw new com.badlogic.gdx.utils.GdxRuntimeException("Couldn't find free pointer id!");
}