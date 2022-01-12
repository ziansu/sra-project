public static boolean fireWebChatEvent(java.lang.String source, java.lang.String name, java.lang.String message) {
    boolean noCancel = true;
    if ((org.dynmap.DynmapCommonAPIListener.dynmapapi) != null) {
        for (org.dynmap.DynmapCommonAPIListener l : org.dynmap.DynmapCommonAPIListener.listeners) {
            noCancel = (l.webChatEvent(source, name, message)) && noCancel;
        }
        org.dynmap.DynmapCommonAPIListener.dynmapapi = null;
    }
    return noCancel;
}