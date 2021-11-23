private void actionReset(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (resetbut)) {
        reset_cmd();
        fpu.reset();
        display();
    }
}