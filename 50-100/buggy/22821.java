@java.lang.Override
public void onClick(com.linangran.tgfcapp.activities.View view) {
    com.linangran.tgfcapp.data.ForumBasicData forumBasicData = ((com.linangran.tgfcapp.data.ForumBasicData) (view.getTag()));
    this.drawerLayout.closeDrawers();
    this.drawerLayout.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.linangran.tgfcapp.activities.MainActivity.this.drawerToggle.syncState();
        }
    });
    this.forumListFragment.reload(forumBasicData);
}