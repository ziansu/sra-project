public void actionPerformed(java.awt.event.ActionEvent event) {
    hu.hajba.gol.gui.GoLPanel.RUNNING = !(hu.hajba.gol.gui.GoLPanel.RUNNING);
    gameBoard.setRunning(hu.hajba.gol.gui.GoLPanel.RUNNING);
    startButton.setText((hu.hajba.gol.gui.GoLPanel.RUNNING ? "Stop" : "Start"));
    clearButton.setEnabled((!(hu.hajba.gol.gui.GoLPanel.RUNNING)));
    sizeXBox.setEnabled((!(hu.hajba.gol.gui.GoLPanel.RUNNING)));
    sizeYBox.setEnabled((!(hu.hajba.gol.gui.GoLPanel.RUNNING)));
    setSizeButton.setEnabled((!(hu.hajba.gol.gui.GoLPanel.RUNNING)));
}