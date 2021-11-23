public void update(contextproject.models.Track curtitle, contextproject.models.Track nxtitle) {
    currentTrack.setText(curtitle.getTitle());
    nextTrack.setText(nxtitle.getTitle());
}