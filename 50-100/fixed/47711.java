@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    repaint();
    if ((RiseOfPoke.Inscriptor.currentState) == (MENU_STATE)) {
        updateMenuState();
    }else
        if ((RiseOfPoke.Inscriptor.currentState) == (GAME_STATE)) {
            updateGameState();
        }else
            if ((RiseOfPoke.Inscriptor.currentState) == (END_STATE)) {
                updateEndState();
            }
        
    
}