@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent ke) {
    getPacmanHuidigePositie();
    switch (ke.getKeyCode()) {
        case java.awt.event.KeyEvent.VK_R :
            break;
        case java.awt.event.KeyEvent.VK_UP :
            pacman.bewegen(Pacman.Richting.NOORD);
            break;
        case java.awt.event.KeyEvent.VK_RIGHT :
            pacman.bewegen(Pacman.Richting.OOST);
            break;
        case java.awt.event.KeyEvent.VK_DOWN :
            pacman.bewegen(Pacman.Richting.ZUID);
            break;
        case java.awt.event.KeyEvent.VK_LEFT :
            pacman.bewegen(Pacman.Richting.WEST);
            break;
    }
}