public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String command = ((javax.swing.JButton) (e.getSource())).getActionCommand();
    java.lang.System.out.println(command);
    GuiUser.sendRobot(r, selectedRobot, ((java.lang.Integer.parseInt(command)) - 1));
    robots[selectedRobot].traveling = true;
    robots[selectedRobot].location = "Travelling";
    blockButtons();
}