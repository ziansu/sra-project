@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    if ((e.getButton()) == (java.awt.event.MouseEvent.BUTTON3)) {
        int chosen_attacker_index = findChosenAttacker(e.getPoint());
        ui.AnimationPanel.setHighlightUAV(chosen_attacker_index);
        my_popup_menu.setChoosedAttackerIndex(chosen_attacker_index);
        my_popup_menu.show(this, e.getX(), e.getY());
        config.StaticInitConfig.SIMULATION_ON = false;
    }
}