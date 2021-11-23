public static void recoverPreviousStats() {
    if (bubbleMaster.Start.previous.equals("chooseLevel"))
        bubbleMaster.Start.chooseLevel = 1;
    else
        if (bubbleMaster.Start.previous.equals("startGame"))
            bubbleMaster.Start.startGame = 1;
        else
            if (bubbleMaster.Start.previous.equals("editGame"))
                bubbleMaster.Start.editGame = 1;
            else
                if (bubbleMaster.Start.previous.equals("endGame"))
                    bubbleMaster.Start.endGame = 1;
                else
                    bubbleMaster.Start.begin = 1;
                
            
        
    
}