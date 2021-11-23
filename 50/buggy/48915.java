@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    listener.onApplyFilterEntry(entriesNames[which]);
    editedOrDeletedCall.call(null);
}