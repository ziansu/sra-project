public boolean isGameOver() {
    if (isStarted()) {
        if ((werewolfSize()) == 0) {
            return true;
        }else
            if ((civilianSize()) == 0) {
                return true;
            }else
                if (((civilianSize()) == 1) && ((werewolfSize()) == 1)) {
                    return true;
                }
            
        
        return false;
    }
    return false;
}