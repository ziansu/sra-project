@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    for (java.lang.Character person : characters) {
        if (person.keysPressed.contains(e.getKeyCode()))
            person.keysPressed.remove(e.getKeyCode());
        
    }
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_SHIFT)) {
        shouldShowHitboxes = !(shouldShowHitboxes);
    }
}