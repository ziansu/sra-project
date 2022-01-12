@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.util.Iterator<net.osmand.plus.audionotes.AudioVideoNotesPlugin.Recording> it = selected.iterator();
    while (it.hasNext()) {
        net.osmand.plus.audionotes.AudioVideoNotesPlugin.Recording pnt = it.next();
        plugin.deleteRecording(pnt);
        it.remove();
        listAdapter.delete(pnt);
    } 
    listAdapter.notifyDataSetChanged();
}