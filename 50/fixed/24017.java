private void replaceWithChatFragment() {
    it.polito.group05.group05.ChatFragment chat = it.polito.group05.group05.ChatFragment.newInstance();
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fragment_container, chat).commit();
    fab.hide();
}