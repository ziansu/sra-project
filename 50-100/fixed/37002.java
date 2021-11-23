private void bringCurrentIntoView() {
    if ((!(Player.songs.moving)) && (!(Player.songs.selecting))) {
        final int p = Player.songs.getCurrentPosition();
        if ((p <= (list.getFirstVisiblePosition())) || (p >= (list.getLastVisiblePosition()))) {
            list.centerItem(p);
        }
    }
}