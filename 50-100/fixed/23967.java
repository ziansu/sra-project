@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    if (!(playingMovie.get())) {
        int t = time.get();
        if ((t >= 1) && (t < ((getEndTime()) - 1)))
            time.set((t + 1));
        
    }
}