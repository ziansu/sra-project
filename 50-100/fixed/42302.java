@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            getActivity().onBackPressed();
            break;
        case R.id.menu_edit_group_channel_save :
            saveGroupChannels(_adapter.getGroupLabel());
            break;
        default :
            timber.log.Timber.e("Option item selected is unknown");
    }
    return super.onOptionsItemSelected(item);
}