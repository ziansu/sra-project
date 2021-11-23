@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    for (int y = 0; y < (beatArray.length); y++) {
        for (boolean b : beatArray[y])
            b = false;
        
    }
    instrumentSlider.setValue(0);
    tempoSlider.setValue(120);
    isPlaying = false;
    startButton.setSelected(false);
    player.clearBeats();
}