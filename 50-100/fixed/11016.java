public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (isPlaying) {
        audio.stop();
        isPlaying = false;
        button.setText("Play");
    }else {
        audio.play();
        isPlaying = true;
        button.setText("Pause");
    }
}