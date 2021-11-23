@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int count = 0;
    for (boolean x : inGame)
        if (x)
            count++;
        
    
    if (count > 0) {
        checkCollision();
        checkIngame();
        move();
    }
    repaint();
}