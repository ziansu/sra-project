@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    client.sendMessage("CreateTable;");
    java.lang.String line;
    line = client.readFromInput();
    if (line.equals("OK")) {
        Frames.GameFrame.GameFrame gameFrame = new Frames.GameFrame.GameFrame(client, lobbyFrame);
        gameFrame.init();
        lobbyFrame.setVisible(false);
    }
}