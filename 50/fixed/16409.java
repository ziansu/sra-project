@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState.containsKey(view.RankingResult.STATE_SELECTED_NAVIGATION_ITEM)) {
        getActionBar().setSelectedNavigationItem(savedInstanceState.getInt(view.RankingResult.STATE_SELECTED_NAVIGATION_ITEM));
    }else {
    }
}