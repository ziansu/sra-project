@java.lang.Override
public boolean dispatchKeyEvent(android.view.KeyEvent event) {
    if (projectsListFragment.lockBackButtonForAsync) {
        return false;
    }
    if (((projectsListFragment.getActionModeActive()) && ((event.getKeyCode()) == (android.view.KeyEvent.KEYCODE_BACK))) && ((event.getAction()) == (android.view.KeyEvent.ACTION_UP))) {
        org.catrobat.catroid.ui.adapter.ProjectAdapter adapter = ((org.catrobat.catroid.ui.adapter.ProjectAdapter) (projectsListFragment.getListAdapter()));
        adapter.clearCheckedProjects();
    }
    return super.dispatchKeyEvent(event);
}