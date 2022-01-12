private void rawUpdateX(int raw) {
    rawX = raw;
    wX = zoomer.stiXm(rawX);
    if ((holdingShift) && ((behavior) instanceof spirite.panel_work.Penner.StateBehavior)) {
        if ((shiftMode) == 2)
            return ;
        
        if ((shiftMode) == 0) {
            if ((java.lang.Math.abs(((shiftX) - (rawX)))) > 10) {
                shiftMode = 1;
            }else
                return ;
            
        }
    }
    x = wX;
}