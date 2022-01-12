@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    if (!(gameRunning)) {
        return ;
    }
    switch (e.getKeyCode()) {
        case java.awt.event.KeyEvent.VK_DOWN :
            model.timeAmplifier = 1;
            break;
        case java.awt.event.KeyEvent.VK_S :
            model.timeAmplifier = 1;
            break;
    }
}