public static char getCurrentKey() {
    char key = 0;
    input.KeyboardInput.actionNow = engine.Engine.keyAction;
    if (((input.KeyboardInput.actionPrev) == 0) && ((input.KeyboardInput.actionNow) == 1))
        key = ((char) (engine.Engine.keyInput));
    else
        key = 0;
    
    input.KeyboardInput.actionPrev = input.KeyboardInput.actionNow;
    return key;
}