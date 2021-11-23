@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    changesManager.deleteUpdates(fileNameWithoutExtension);
    changesManager.removeRegionUpdateReferences(fileNameWithoutExtension);
    net.osmand.plus.liveupdates.LiveUpdatesHelper.preferenceLastCheck(localIndexInfo, getMyApplication().getSettings()).resetToDefault();
}