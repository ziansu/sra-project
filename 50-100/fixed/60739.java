@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    buildStatus();
    buildInstructions();
    buildStack();
    buildReturnStack();
    buildVariables();
    buildHardwareVariables();
    lastPrint.setText(java.lang.String.format("Last Print: %s", (hasBrain() ? brain.LastPrint() : "None")));
    updateRobotImage();
    robotIcon.setIcon(new javax.swing.ImageIcon(robotImage));
}