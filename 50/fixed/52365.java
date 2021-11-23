public void actionPerformed(java.awt.event.ActionEvent e) {
    soundPlayer.myStop();
    if (!(setTargetFile(true))) {
        return ;
    }
    int aaa;
    changeStatePlay();
    soundPlayer.myPlay();
    timerStart();
}