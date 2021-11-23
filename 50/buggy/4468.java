public static java.lang.String getNameToDisplay(net.osmand.plus.activities.LocalIndexInfo child, net.osmand.plus.activities.OsmandActionBarActivity activity) {
    java.lang.String mapName = net.osmand.plus.helpers.FileNameTranslationHelper.getFileName(activity, activity.getMyApplication().getResourceManager().getOsmandRegions(), child.getFileName());
    return mapName;
}