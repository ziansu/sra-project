private com.jogamp.nativewindow.util.Point getLocationOnScreenImpl(final int x, final int y, final com.jogamp.nativewindow.NativeWindow parent, final boolean useParent) {
    if (((!useParent) && (!(isOffscreenInstance))) && (0 != (surfaceHandle))) {
        return jogamp.nativewindow.macosx.OSXUtil.GetLocationOnScreen(surfaceHandle, x, y);
    }else {
        final com.jogamp.nativewindow.util.Point p = new com.jogamp.nativewindow.util.Point(x, y);
        if (useParent) {
            p.translate(parent.getLocationOnScreen(null));
        }
        return p;
    }
}