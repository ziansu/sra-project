public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((PlayerName) == null) {
        PlayerName = javax.swing.JOptionPane.showInputDialog(null, "Please Input Your Name:", "");
        com.suntc.tictactoe.ClientGui.Send(((Server.C_NAMEIS) + (PlayerName)));
    }
    dlgWaiting.setVisible(true);
    com.suntc.tictactoe.ClientGui.Send(Server.C_ENQUEUE);
}