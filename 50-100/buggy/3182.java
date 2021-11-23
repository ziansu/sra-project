@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        switch (item.getItemId()) {
            case R.id.action_edit_saved_trips :
                if ((actionModeEdit) != null) {
                    return false;
                }
                actionModeEdit = getActivity().startActionMode(mActionModeCallback);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }
    } catch (java.lang.Exception ex) {
        android.util.Log.e(edu.pdx.cecs.orcyclesensors.Fragment_MainTrips.MODULE_TAG, ex.getMessage());
    }
    return false;
}