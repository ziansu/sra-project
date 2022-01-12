public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (isPlaying) {
        audio.stop();
        isPlaying = false;
        button.setText("Pause");
    }else {
        audio.play();
        isPlaying = true;
        button.setText("Play");
    }
}