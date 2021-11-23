@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    eventItemRow.setStatus(Event.STATUS_DELETED);
    eventItemRow.save();
    dialog.dismiss();
}