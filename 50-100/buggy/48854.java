public void keyReleased(java.awt.event.KeyEvent e) {
    int i = e.getKeyCode();
    switch (i) {
        case java.awt.event.KeyEvent.VK_A :
            aIsDown = false;
            break;
        case java.awt.event.KeyEvent.VK_D :
            dIsDown = false;
            break;
        case java.awt.event.KeyEvent.VK_W :
            wIsDown = false;
            break;
        case java.awt.event.KeyEvent.VK_S :
            sIsDown = false;
            break;
    }
    if (((aIsDown) || (dIsDown)) && (!(p.isJumping)))
        java.lang.System.out.println("This is happening");
    
    p.isRunning = true;
    p.setVelx(0);
    p.isStanding = true;
}