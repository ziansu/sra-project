@java.lang.Override
public synchronized void actionPerformed(java.awt.event.ActionEvent e) {
    instrumentSlider.setValue(0);
    for (int y = 0; y < (beatArray.length); y++) {
        for (int x = 0; x < (beatArray[y].length); x++)
            beatArray[y][x] = false;
        
    }
    tempoSlider.setValue(120);
    isPlaying = false;
    startButton.setSelected(false);
    player.clearBeats();
}