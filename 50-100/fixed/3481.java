public void gotoHistoryHomeScreen(android.view.View view) {
    android.app.Fragment gamesListFragment = getFragmentManager().findFragmentById(R.layout.games_list);
    if (gamesListFragment == null) {
        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.home_history_frame, new com.splashmobileproductions.scorekeep.GameHistoryFragment()).commitAllowingStateLoss();
        mTransitionManager.transitionTo(mHistoryScene);
    }
}