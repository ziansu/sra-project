public void startFullscreen() {
    if (fullscreen)
        return ;
    
    dispose();
    setUndecorated(true);
    setBounds(0, 0, getToolkit().getScreenSize().width, getToolkit().getScreenSize().height);
    setResizable(false);
    setVisible(true);
}