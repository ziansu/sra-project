public void keyReleased(java.awt.event.KeyEvent e) {
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER)) {
        konamiCodeStep = 0;
        this.clientTopic.actionPerformed(null);
    }else
        if ((e.getKeyCode()) == (fr.alma.middleware.loki.client.gui.TopicWindow.KONAMI_CODE[konamiCodeStep])) {
            (konamiCodeStep)++;
            if ((konamiCodeStep) >= (fr.alma.middleware.loki.client.gui.TopicWindow.KONAMI_CODE.length)) {
                konamiCodeState = !(konamiCodeState);
                konamiCodeStep = 0;
            }
        }else {
            konamiCodeStep = 0;
        }
    
}