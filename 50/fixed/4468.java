public static java.lang.String getNameToDisplay(net.osmand.plus.activities.LocalIndexInfo child, net.osmand.plus.activities.OsmandActionBarActivity activity) {
    return net.osmand.plus.helpers.FileNameTranslationHelper.getFileName(activity, activity.getMyApplication().getResourceManager().getOsmandRegions(), child.getFileName());
}