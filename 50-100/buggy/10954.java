public void update() {
    width = display.getFrame().getWidth();
    height = display.getFrame().getHeight();
    keyManager.update();
    if ((dev.Same4254.ThisGame.States.State.getCurrentState()) != null)
        dev.Same4254.ThisGame.States.State.getCurrentState().update();
    
    repaint();
    java.lang.System.out.println(("Pro: " + (dev.Same4254.ThisGame.Entities.Prophecy.prophosizing)));
}