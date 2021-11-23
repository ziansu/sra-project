@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.received_device_options_refresh :
            getContext().sendBroadcast(new android.content.Intent(com.genonbeta.TrebleShot.receiver.FileChangesReceiver.ACTION_FILE_LIST_CHANGED));
            return true;
        case R.id.received_device_options_open_in_file_manager :
            this.openFile(android.net.Uri.fromFile(com.genonbeta.TrebleShot.helper.ApplicationHelper.getApplicationDirectory(getActivity())), "*/*", getString(R.string.pick_file_manager));
            return true;
    }
    return super.onOptionsItemSelected(item);
}