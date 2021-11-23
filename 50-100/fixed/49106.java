public void doDefense(java.lang.String which) {
    if (which.equals("left")) {
        if (GameLogic.leftPlayerDefense.isEmpty())
            return ;
        else
            startLeftPowerup(4);
        
    }else
        if (which.equals("right")) {
            if (GameLogic.rightPlayerDefense.isEmpty())
                return ;
            else
                startRightPowerup(4);
            
        }
    
}