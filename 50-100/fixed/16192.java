private boolean fill() {
    if ((rule.getBallFiller()) == null) {
        moveToStable();
        return false;
    }
    boolean result = false;
    if (rule.autoRotate())
        autoRotate();
    else
        moveToStable();
    
    VAST.HexGame.Game.BallFillerInterface filler = rule.getBallFiller();
    if (filler != null)
        result = filler.fillBalls(balls);
    
    if (rule.autoRotate())
        autoRotate();
    else
        moveToStable();
    
    return result;
}