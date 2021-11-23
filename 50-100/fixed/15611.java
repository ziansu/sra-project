public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (p_button)) {
        if ((CurrentPanel) == 0) {
            MPP.refresh();
            CurrentPanel = 1;
            MNP.setVisible(false);
            MPP.setVisible(true);
        }else {
            MNP.refresh();
            CurrentPanel = 0;
            MNP.setVisible(true);
            MPP.setVisible(false);
        }
    }
}