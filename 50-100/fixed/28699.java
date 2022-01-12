@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.received_device_options_open_in_file_manager :
            this.openFile(android.net.Uri.fromFile(com.genonbeta.TrebleShot.helper.ApplicationHelper.getApplicationDirectory(getActivity())), "*/*", getString(R.string.pick_file_manager));
            return true;
    }
    return super.onOptionsItemSelected(item);
}