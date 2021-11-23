@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    R.pressedKeys.add(e.getKeyCode());
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_1)) {
        p.setWeaponEquiped(new tower.Fists());
    }
    if ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_2)) {
        p.setWeaponEquiped(new tower.Gun());
    }
}