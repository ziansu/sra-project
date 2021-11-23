public void actionPerformed(java.awt.event.ActionEvent e) {
    if (((((scoutShips.size()) == 0) && ((battleCruisers.size()) == 2)) && ((airCarriers.size()) == 0)) && ((submarines.size()) == 0)) {
        hasGameStarted = true;
        javax.swing.JOptionPane.showMessageDialog(null, "The game will now start.");
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "You must fulfill the requirements first.");
    }
}