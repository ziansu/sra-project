@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    if (((actionListener.getActionModeActive()) && ((event.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK))) && ((event.getAction()) == (android.view.KeyEvent.ACTION_UP))) {
        org.catrobat.catroid.ui.adapter.SpriteAdapter adapter = spritesListFragment.getSpriteAdapter();
        adapter.clearCheckedItems();
    }
    return super.dispatchKeyEvent(event);
}