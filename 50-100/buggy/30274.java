public static void runLiveUpdate(android.content.Context context, final net.osmand.plus.activities.LocalIndexInfo info, boolean forceUpdate) {
    final java.lang.String fnExt = net.osmand.util.Algorithms.getFileNameWithoutExtension(new java.io.File(info.getFileName()));
    new net.osmand.plus.liveupdates.PerformLiveUpdateAsyncTask(context, info, forceUpdate).execute(new java.lang.String[]{ fnExt });
}