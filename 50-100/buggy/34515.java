@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    adapter.clearFocus();
    switch (item.getItemId()) {
        case R.id.menu_download_parameters :
            refreshParameters();
            break;
        case R.id.menu_write_parameters :
            writeModifiedParametersToDrone();
            break;
        case R.id.menu_open_parameters :
            openParametersFromFile();
            break;
        case R.id.menu_save_parameters :
            saveParametersToFile();
            break;
        case R.id.menu_filter_params :
            final boolean isEnabled = !(isParameterFilterVisible());
            toggleParameterFilter(isEnabled, isEnabled);
            break;
        default :
            return super.onOptionsItemSelected(item);
    }
    return true;
}