public void doPowerup(java.lang.String which) {
    if (which.equals("left")) {
        if (GameLogic.leftPlayerPowerup.isEmpty())
            return ;
        
        startLeftPowerup(GameLogic.leftPlayerPowerup.pop());
    }else
        if (which.equals("right")) {
            if (GameLogic.rightPlayerPowerup.isEmpty())
                return ;
            
            startRightPowerup(GameLogic.rightPlayerPowerup.pop());
        }
    
}