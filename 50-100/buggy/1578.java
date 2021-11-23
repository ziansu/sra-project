public static void processKeyEvent(int keyCode, me.simonhaasnoot.geinigspel.game.input.key.KeyEventType eventType) {
    switch (eventType) {
        case PRESSED :
            if (!(me.simonhaasnoot.geinigspel.game.input.Input.pressedKeys.contains(keyCode))) {
                me.simonhaasnoot.geinigspel.game.input.Input.pressedKeys.add(keyCode);
                me.simonhaasnoot.geinigspel.game.input.Input.pressedOnceKeys.add(keyCode);
                break;
            }
        case RELEASED :
            me.simonhaasnoot.geinigspel.game.input.Input.pressedKeys.remove(((java.lang.Integer) (keyCode)));
            me.simonhaasnoot.geinigspel.game.input.Input.pressedOnceKeys.remove(((java.lang.Integer) (keyCode)));
            break;
        default :
    }
}