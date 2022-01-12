@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    if (((actionListener.getActionModeActive()) && ((event.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK))) && ((event.getAction()) == (android.view.KeyEvent.ACTION_UP))) {
        if (((org.catrobat.catroid.ui.ProjectActivity.currentFragmentPosition) == (org.catrobat.catroid.ui.ProjectActivity.FRAGMENT_SCENES)) && (scenesListFragment.lockBackButtonForAsync)) {
            return false;
        }else {
            org.catrobat.catroid.ui.adapter.SpriteAdapter adapter = spritesListFragment.getSpriteAdapter();
            adapter.clearCheckedItems();
        }
    }
    return super.dispatchKeyEvent(event);
}