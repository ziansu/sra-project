public boolean isGameOver() {
    if (isStarted()) {
        if ((werewolfSize()) == 0) {
            return true;
        }else
            if ((civilianSize()) == 0) {
                return true;
            }else
                if ((civilianSize()) == (werewolfSize())) {
                    return true;
                }
            
        
        return false;
    }
    return false;
}