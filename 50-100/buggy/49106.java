public void doDefense(java.lang.String which) {
    if (which.equals("left")) {
        if (GameLogic.leftPlayerDefense.isEmpty())
            return ;
        
        startLeftPowerup(4);
    }else
        if (which.equals("right")) {
            if (GameLogic.rightPlayerDefense.isEmpty())
                return ;
            
            startRightPowerup(4);
        }
    
}