public void rawUpdateY(int raw) {
    rawY = raw;
    wY = zoomer.stiYm(rawY);
    if ((holdingShift) && ((behavior) instanceof spirite.panel_work.Penner.StateBehavior)) {
        if ((shiftMode) == 1)
            return ;
        
        if ((shiftMode) == 0) {
            if ((java.lang.Math.abs(((shiftY) - (rawY)))) > 10) {
                shiftMode = 2;
            }else
                return ;
            
        }
    }
    y = wY;
}