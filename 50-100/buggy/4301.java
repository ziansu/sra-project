public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((TicTacToe.NotInGame.get()) || (!(this.c.DoneInit)))
        java.lang.System.exit(0);
    else {
        TicTacToe.NotInGame.set(true);
        this.display.gameOverMsgLock.lock();
        try {
            this.display.gameOverMsg = "Click to start.";
        } finally {
            this.display.gameOverMsgLock.unlock();
        }
    }
}