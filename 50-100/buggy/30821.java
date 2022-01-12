static void setForeground(final android.view.View view, final android.graphics.drawable.Drawable foreground) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.ICE_CREAM_SANDWICH))
        return ;
    
    if (view instanceof android.widget.FrameLayout) {
        ((android.widget.FrameLayout) (view)).setForeground(foreground);
    }else
        if (view instanceof de.vanita5.twittnuker.view.iface.IForegroundView) {
            ((de.vanita5.twittnuker.view.iface.IForegroundView) (view)).setForeground(foreground);
        }
    
}