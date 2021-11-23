@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent e) {
    java.lang.System.out.println(("Meanie!" + (e.getKeyChar())));
    if (((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_SPACE)) && ((gs.getSelectedCard()) != null)) {
        java.lang.System.out.println("Calling AbilityEvent");
        gs.getBus().callEvent(new events.AbilityEvent(gs, gs.getSelectedCard()));
        gs.getAttacking().remove(gs.getSelectedCard());
    }
}