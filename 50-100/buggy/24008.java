public void processInput() {
    if (org.lwjgl.input.Keyboard.isKeyDown(Keyboard.KEY_W)) {
        move(0, 1);
    }else
        if (org.lwjgl.input.Keyboard.isKeyDown(Keyboard.KEY_S)) {
            move(0, (-1));
        }else
            if (org.lwjgl.input.Keyboard.isKeyDown(Keyboard.KEY_A)) {
                move((-1), 0);
            }else
                if (org.lwjgl.input.Keyboard.isKeyDown(Keyboard.KEY_D)) {
                    move(1, 0);
                }
            
        
    
}