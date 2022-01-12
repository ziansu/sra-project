@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    menu.add(Menu.NONE, 0, Menu.NONE, R.string.train_add_to_widget).setIcon(R.drawable.ic_menu_save).setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
    menu.add(Menu.NONE, 1, Menu.NONE, R.string.action_add_to_favorites).setIcon(R.drawable.ic_menu_star).setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
    menu.add(Menu.NONE, 4, Menu.NONE, R.string.activity_label_compensation).setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
    menu.add(Menu.NONE, 3, Menu.NONE, R.string.nav_drawer_chat).setIcon(R.drawable.ic_menu_start_conversation).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
}