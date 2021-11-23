public void actionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.Object src = evt.getSource();
    if (src == (newGameButton))
        doNewGame();
    else
        if (src == (resignButton))
            doResign();
        else
            if (src == (undoMove))
                doUndoMove();
            
        
    
}