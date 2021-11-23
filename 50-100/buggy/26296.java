public void switchMenuTo(@android.support.annotation.NonNull
com.appeaser.sublimenavigationviewlibrary.SublimeMenu newMenu) {
    if (newMenu == null) {
        android.util.Log.e(com.appeaser.sublimenavigationviewlibrary.SublimeNavigationView.TAG, "Could not switch to new menu: passed menu was 'null'.");
        return ;
    }
    mMenu = newMenu;
    mMenu.setCallback(new com.appeaser.sublimenavigationviewlibrary.SublimeMenu.Callback() {
        public boolean onMenuItemSelected(com.appeaser.sublimenavigationviewlibrary.SublimeMenu menu, com.appeaser.sublimenavigationviewlibrary.SublimeBaseMenuItem item, com.appeaser.sublimenavigationviewlibrary.OnNavigationMenuEventListener.Event event) {
            return ((com.appeaser.sublimenavigationviewlibrary.SublimeNavigationView.this.mEventListener) != null) && (com.appeaser.sublimenavigationviewlibrary.SublimeNavigationView.this.mEventListener.onNavigationMenuEvent(event, item));
        }
    });
    mMenu.setMenuPresenter(mPresenter);
}