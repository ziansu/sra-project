private void bringCurrentIntoView() {
    if ((!(Player.songs.moving)) && (!(Player.songs.selecting))) {
        final int p = Player.songs.getCurrentPosition();
        if ((p <= (list.getFirstVisiblePosition())) || (p >= (list.getLastVisiblePosition()))) {
            if (br.com.carlosrafaelgn.fplay.ui.UI.animationEnabled)
                list.centerItemSmoothly(p);
            else
                list.centerItem(p);
            
        }
    }
}