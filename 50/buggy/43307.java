@java.lang.Override
public void run() {
    if (engine.GameContext.paused)
        return ;
    
    engine.GameContext.menu.repaintUI(true);
}