public static void processKeyEvent(int keyCode, me.KeyBarricade2D.input.key.KeyEventType eventType) {
    switch (eventType) {
        case PRESSED :
            if (!(me.KeyBarricade2D.input.Input.pressedKeys.contains(keyCode)))
                me.KeyBarricade2D.input.Input.pressedKeys.add(keyCode);
            
            break;
        case RELEASED :
            me.KeyBarricade2D.input.Input.pressedKeys.remove(((java.lang.Integer) (keyCode)));
            break;
        default :
    }
}