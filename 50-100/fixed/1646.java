public static void recoverPreviousStats() {
    if (bubbleMaster.Start.previous.get(0).equals("chooseLevel"))
        bubbleMaster.Start.chooseLevel = 1;
    else
        if (bubbleMaster.Start.previous.get(0).equals("startGame"))
            bubbleMaster.Start.startGame = 1;
        else
            if (bubbleMaster.Start.previous.get(0).equals("editGame"))
                bubbleMaster.Start.editGame = 1;
            else
                if (bubbleMaster.Start.previous.get(0).equals("endGame"))
                    bubbleMaster.Start.endGame = 1;
                else
                    bubbleMaster.Start.begin = 1;
                
            
        
    
    bubbleMaster.Start.previous.remove(0);
}