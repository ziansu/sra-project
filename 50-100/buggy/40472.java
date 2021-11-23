@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    SetClient.client.send("BOARD\r\n");
    java.lang.String rply = SetClient.client.recv();
    if (!(rply.equals("You're not playing a game"))) {
        while (!(rply.startsWith("--END--"))) {
            rply = SetClient.client.recv();
        } 
        gp.refresh();
    }
}