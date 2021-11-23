private boolean actionReset() {
    for (android.support.v4.app.Fragment player : mFragmentManager.getFragments().subList(0, numPlayers)) {
        if (player != null)
            ((com.blogspot.onekeyucd.healthtracker.PlayerFragment) (player)).reset();
        
    }
    return true;
}