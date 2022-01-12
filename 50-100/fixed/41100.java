@java.lang.Override
public void update(float delta) {
    this.time = (this.time) + delta;
    if (((InputHandler.lastClick.x) < ((com.dragonjam.game.utility.Constants.W_WIDTH) / 2)) && ((com.dragonjam.game.utility.InputHandler.button) != (InputHandler.ButtonType.NONE))) {
        location.x = -100;
        state = 1;
    }else
        if ((com.dragonjam.game.utility.InputHandler.button) != (InputHandler.ButtonType.NONE)) {
            location.x = 100;
            state = 0;
        }
    
}