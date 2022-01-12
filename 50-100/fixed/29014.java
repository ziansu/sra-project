@java.lang.Override
public void onClick(android.view.View v) {
    org.odk.collect.android.application.Collect.getInstance().getActivityLogger().logAction(this, "deleteButton", java.lang.Integer.toString(mSelected.size()));
    if ((mSelected.size()) > 0) {
        createDeleteInstancesDialog();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), R.string.noselect_error, Toast.LENGTH_SHORT).show();
    }
}