@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int item_id = item.getItemId();
    if (item_id == (R.id.search_menu_item)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.example.apple.newsingit_project.SearchTabActivity.class);
        startActivityForResult(intent, com.example.apple.newsingit_project.view.view_fragment.MyInfoFragment.RC_EDITMYINFO);
    }
    return super.onOptionsItemSelected(item);
}