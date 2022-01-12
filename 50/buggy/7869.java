public void actionPerformed(java.awt.event.ActionEvent e) {
    if (GameBoard.isSolving) {
        javax.swing.JOptionPane.showMessageDialog(null, "Please wait for puzzle to solve!");
    }else {
        new InputGrid();
    }
}