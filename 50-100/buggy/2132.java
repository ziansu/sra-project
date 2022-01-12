@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent event) {
    if ((event.getKeyCode()) == (java.awt.event.KeyEvent.VK_LEFT))
        playerCar.keyPressed(event);
    else
        if ((event.getKeyCode()) == (java.awt.event.KeyEvent.VK_RIGHT))
            playerCar.keyPressed(event);
        else
            if ((event.getKeyCode()) == (java.awt.event.KeyEvent.VK_DOWN))
                textEntry.keyPressed(event);
            else
                if ((event.getKeyCode()) == (java.awt.event.KeyEvent.VK_BACK_SPACE))
                    textEntry.keyPressed(event);
                
            
        
    
}