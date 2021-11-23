private void blink() {
    if ((sScoreLabel.equals("s")) || (sScoreLabel.equals("measure1"))) {
        blinkBig();
    }else
        if (sScoreLabel.equals("e15")) {
            blinkBig();
        }else
            if (sScoreLabel.equals("e101")) {
                blinkOnce();
            }else
                if (sScoreLabel.equals("e102")) {
                    blinkBig();
                }else
                    if (sScoreLabel.equals("e104")) {
                        blinkOnce();
                    }
                
            
        
    
}