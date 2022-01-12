public void actionPerformed(java.awt.event.ActionEvent e) {
    if (initial) {
        frame.setAlwaysOnTop(false);
        musicPlayer.frame.setVisible(true);
        musicPlayer.frame.setAlwaysOnTop(true);
        musicOpen = true;
        initial = false;
    }else {
        frame.setAlwaysOnTop(false);
        musicPlayer.frame.setVisible(true);
        musicPlayer.frame.setAlwaysOnTop(true);
    }
}