@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (true) {
        finishButton.setVisible(false);
        statusLabel.setFont(new java.awt.Font("Courier", java.awt.Font.BOLD, 24));
        statusLabel.setText("FINISHED! You may now close this window");
        statusLabel.setBackground(java.awt.Color.GREEN);
        statusLabel.setForeground(java.awt.Color.WHITE);
        java.lang.System.out.println("Testing Finalization block");
        CANCELLED = false;
        this.dispose();
    }
    statusLabel.setOpaque(true);
    bottomCenterPane.revalidate();
    bottomCenterPane.repaint();
}