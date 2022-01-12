@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return new com.romankaranchuk.musicplayer.ui.tracklist.TracklistFragment();
    }else
        if (position == 1) {
            return com.romankaranchuk.musicplayer.ui.player.PlayerFragment.getSingleton();
        }
    
    return null;
}