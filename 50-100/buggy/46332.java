@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            if ((mlipa.move.client.SettingsActivity.windowLengthChanged) || (mlipa.move.client.SettingsActivity.artificialNeuralNetworkChanged)) {
                showReLearnDialog();
            }
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}