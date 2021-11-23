public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (p_button)) {
        if ((CurrentPanel) == 0) {
            MNP.setVisible(false);
            MPP.setVisible(true);
            CurrentPanel = 1;
        }else {
            MNP.setVisible(true);
            MPP.setVisible(false);
            MNP.refresh();
            CurrentPanel = 0;
        }
    }
}