private java.lang.String getNameToDisplay(net.osmand.plus.activities.LocalIndexInfo child) {
    return net.osmand.plus.helpers.FileNameTranslationHelper.getFileName(ctx, ctx.getMyApplication().getResourceManager().getOsmandRegions(), child.getFileName());
}