public void doPowerup(java.lang.String which) {
    if (which.equals("left")) {
        if (GameLogic.leftPlayerPowerup.isEmpty())
            return ;
        else
            startLeftPowerup(GameLogic.leftPlayerPowerup.pop());
        
    }else
        if (which.equals("right")) {
            if (GameLogic.rightPlayerPowerup.isEmpty())
                return ;
            else
                startRightPowerup(GameLogic.rightPlayerPowerup.pop());
            
        }
    
}