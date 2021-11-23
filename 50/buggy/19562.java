public static java.lang.String getBestPath(final android.content.Context p) {
    try {
        return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.get().bestPath(p);
    } catch (java.lang.Exception e) {
    }
    return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Dummy.Holder.sInstance.path(p);
}