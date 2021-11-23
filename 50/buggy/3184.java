public void actionPerformed(java.awt.event.ActionEvent e) {
    (currentTick)++;
    if (((currentTick) % 1) == 0)
        spaceinvaders.GUI.move();
    
    spaceinvaders.GameLogic.getShip();
}