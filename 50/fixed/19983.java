public void stopVideo() {
    fab.setVisibility(View.GONE);
    slideToTop(youTubeView);
    showInfo();
    while (player.hasNext()) {
        player.next();
    } 
}