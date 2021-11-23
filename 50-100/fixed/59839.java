public void playVideo(edu.gatech.teamnull.thdhackathon2017.model.Video video) {
    if (videoHidden) {
        slideDown(youTubeView);
    }
    currentlyPlaying = video;
    fab.setVisibility(View.VISIBLE);
    fab.bringToFront();
    if (!(wasRestored)) {
        player.cueVideo(video.getId());
        if (player.hasNext()) {
            player.next();
        }
    }
}