@java.lang.Override
public void onMainMenuItemSelected(int menuItemId) {
    switch (menuItemId) {
        case MainMenuFragment.MENU_FILMS_ID :
            replaceFragment(com.kvest.odessatoday.ui.activity.FilmsFragment.getInstance());
            setTitle(R.string.menu_films);
            break;
        case MainMenuFragment.MENU_CINEMA_ID :
            replaceFragment(com.kvest.odessatoday.ui.activity.CinemasListFragment.getInstance());
            setTitle(R.string.menu_cinema);
            break;
    }
    invalidateOptionsMenu();
    slidingMenu.showContent();
}