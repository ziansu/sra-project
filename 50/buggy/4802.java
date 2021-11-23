@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    playingMovie.set((!(playingMovie.get())));
    if (playingMovie.get())
        playButton.setGraphic(playIcon);
    else
        playButton.setGraphic(pauseIcon);
    
}