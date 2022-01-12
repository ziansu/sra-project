public void itemStateChanged(java.awt.event.ItemEvent e) {
    if ((e.getStateChange()) == (java.awt.event.ItemEvent.DESELECTED)) {
        user.limited = false;
    }else {
        user.limited = true;
    }
}