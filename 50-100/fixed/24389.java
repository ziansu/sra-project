@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (arg0.getActionCommand().equals("pvc")) {
        java.lang.System.out.println("[TODO]");
        startGame(false);
    }else
        if (arg0.getActionCommand().equals("pvp")) {
            startGame(true);
        }
    
}