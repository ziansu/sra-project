private void launchDialogsListFragment() {
    android.util.Log.d("MainActivity", "launchDialogsListFragment()");
    setCurrentFragment(com.quickblox.q_municate.ui.fragments.chats.DialogsListFragment.newInstance(), true);
}