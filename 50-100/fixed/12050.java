@java.lang.Override
public void onChange(boolean selfChange, android.net.Uri uri) {
    if (uri.equals(Settings.System.getUriFor(Settings.System.STATUS_BAR_EXPANDED_HEADER_TEXT_COLOR))) {
        updateTextColor();
    }else
        if (uri.equals(Settings.System.getUriFor(Settings.System.STATUS_BAR_EXPANDED_HEADER_ICON_COLOR))) {
            updateIconColor();
        }
    
}