@java.lang.Override
public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);
    android.view.MenuInflater menuInflater = getActivity().getMenuInflater();
    menuInflater.inflate(R.menu.menu_dictionary_management_long_press, menu);
}