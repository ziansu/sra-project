@java.lang.Override
public void onClick(android.view.View v) {
    for (fiskinfoo.no.sintef.fiskinfoo.Baseclasses.ToolEntry toolEntry : unconfirmedRemovedTools) {
        toolEntry.setToolStatus(ToolEntryStatus.STATUS_REMOVED);
    }
    user.writeToSharedPref(v.getContext());
    dialog.dismiss();
}